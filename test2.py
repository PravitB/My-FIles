import csv

rect = 0
prices = []

try:
    with open('prod.csv', 'r', newline='') as fl:
        csvrd = csv.reader(fl)
        header = next(csvrd)  # Read the header row
        price_index = header.index('Pprice')  # Find the index of the 'Pprice' column
        for row in csvrd:
            print('\t'.join(row))
            rect+=1
            if row:  # Check if row is not empty
                prices.append(float(row[price_index]))  # Use the price_index to get the price
        avg = sum(prices) / len(prices) if prices else 0
        print('Average price = %g' % avg)
except Exception as e:
    print('ERROR', e)
finally:
    print('Record count:', rect)