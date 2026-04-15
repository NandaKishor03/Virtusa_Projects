import pandas as pd
import os
from datetime import datetime

FILE_NAME = "data.csv"

def initialize_file():
    if not os.path.exists(FILE_NAME):
        df = pd.DataFrame(columns=["Date", "Category", "Amount", "Description"])
        df.to_csv(FILE_NAME, index=False)

def load_data():
    try:
        return pd.read_csv(FILE_NAME)
    except FileNotFoundError:
        initialize_file()
        return pd.read_csv(FILE_NAME)

def add_expense(date, category, amount, description):
    df = load_data()
    try:
        datetime.strptime(date, "%Y-%m-%d")  # validate date
        new_data = {"Date": date, "Category": category, "Amount": float(amount), "Description": description}
        df = pd.concat([df, pd.DataFrame([new_data])], ignore_index=True)
        df.to_csv(FILE_NAME, index=False)
        print("Expense added successfully!")
    except ValueError:
        print("Invalid date format. Use YYYY-MM-DD.")

def view_expenses():
    df = load_data()
    if df.empty:
        print("No expenses recorded.")
    else:
        print(df)
