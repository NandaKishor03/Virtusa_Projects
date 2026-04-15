import pandas as pd
import matplotlib.pyplot as plt
from expense_manager import load_data

def monthly_summary():
    df = load_data()
    if df.empty:
        print("No data available.")
        return

    df["Date"] = pd.to_datetime(df["Date"])
    df["Month"] = df["Date"].dt.to_period("M")
    summary = df.groupby("Month")["Amount"].sum()

    print("\nMonthly Summary:")
    print(summary)

def category_breakdown():
    df = load_data()
    if df.empty:
        print("No data available.")
        return

    category_sum = df.groupby("Category")["Amount"].sum()
    print("\nCategory-wise Spending:")
    print(category_sum)

    category_sum.plot(kind="pie", autopct='%1.1f%%')
    plt.title("Spending by Category")
    plt.ylabel("")
    plt.show()

def highest_spending_category():
    df = load_data()
    if df.empty:
        print("No data available.")
        return

    category_sum = df.groupby("Category")["Amount"].sum()
    highest = category_sum.idxmax()
    print(f"\nHighest spending category: {highest}")
