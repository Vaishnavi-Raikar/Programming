import pandas as pd
import joblib

from sklearn.model_selection import train_test_split
from sklearn.linear_model import LogisticRegression
from sklearn.metrics import accuracy_score,confusion_matrix

df = pd.read_csv("customer_churn.csv")

print("-"*40)
print("Customer Dataset")
print(df)
print("-"*40)

X = df[["Age","Tenure","MonthlyCharges","SupportCalls"]]
Y = df["Churn"]

x_train,X_test,Y_train,Y_test = train_test_split(X,Y,test_size=0.2,random_state=42)

model = LogisticRegression(max_iter=1000)

model.fit(x_train,Y_train)

y_pred = model.predict(X_test)

accuracy = accuracy_score(Y_test,Y_test)

print("Accuracy is : ",accuracy)
print("Confusion matrix : ")
print(confusion_matrix(Y_test,y_pred))

age = int(input("\nEnter your age : "))
tenure = int(input("\nEnter your tenure : "))
charges = int(input("\nEnter your charges : "))
calls = int(input("\nEnter your support calls : "))


new_cutomer = pd.DataFrame({
    "Age" : [age],
    "Tenure" : [tenure],
    "MonthlyCharges": [charges],
    "SupportCalls" : [calls]
})

prediction = model.predict(new_cutomer)

if prediction[0] == 1 :
    print("\nCustomer is likely to churn")
else:
    print("\nCustomer is unlikely to churn")

joblib.dump(model, "Marvellous_ML_Customr_Churn.pkl")

print("Model saved sucessfully")