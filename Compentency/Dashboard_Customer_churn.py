import streamlit as st
import pandas as pd
import joblib

st.set_page_config(page_title="Marvellous Infosytems Dashboard")

st.title("Marvellous Infosystems By Piyush Manohar Khairnar")
st.header("Customer Churn Prediction")
st.write("Machine Learning Application Dashobaord")

model = joblib.load("Marvellous_ML_Customr_Churn.pkl")

st.subheader("Enter customer details")

age = st.number_input("Customer Age",min_value=1)
tenure = st.number_input("Tenure (Months)",min_value=0)
charges = st.number_input("Monthly Charges",min_value=0)
calls = st.number_input("Support Calls",min_value=0)

if st.button("Predict Churn"):
    new_cutomer = pd.DataFrame({
        "Age" : [age],
        "Tenure" : [tenure],
        "MonthlyCharges": [charges],
        "SupportCalls" : [calls]
    })

    prediction = model.predict(new_cutomer)[0]

    if prediction == 1 :
        st.error("\nCustomer is likely to churn")
    else:
        st.success("\nCustomer is unlikely to churn")

st.divider()

st.caption("Mavrellous Infosystems Dashboard")

