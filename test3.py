# Import the csv module to handle CSV files
import csv

# Initialize the record counter to 0
rect = 0

# Initialize the total price to 0
total_price = 0

# Initialize an empty list to store the prices
prices = []

# Start a try block to catch exceptions
try:
    # Open the CSV file for reading
    fl=open('prod.csv', 'r',newline='')
    csvrd=csv.reader(fl)
        
    # Iterate over each row in the CSV file
    for row in csvrd:
        # Print the row, with columns separated by tabs
        print('\t'.join(row))
        
        # Increment the record counter
        rect += 1
        
        # If this is not the first row and the row is not empty
        if rect > 1 and row:
            # Append the price (third column) to the prices list
            prices.append(float(row[2]))
    
    # Calculate the average price, or 0 if there are no prices
    avg = sum(prices) / len(prices) if prices else 0
    
    # Print the average price
    print('Average price = %g' % avg)

# If an exception occurs
except Exception as e:
    # Print the error message
    print('ERROR', e)

# After the try block has finished
finally:
    # Print the record count
    print('Record count:', rect)