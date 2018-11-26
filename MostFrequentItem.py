def most_frequent(given_list):
    max_count = 0
    max_item = None
    count = {}
    # Iterate the list
    for i in given_list:
        # If the item is not in the dictionary
        if i not in count:
            # Add the item in the dictionary with the value of one
            count[i] = 1
        else:
            # If the item is in the dictionary increment the value of the item by one
            count[i] += 1
        # If the item has a value greater than max_count
        if count[i] > max_count:
            # Set max_count to the value of the item
            max_count = count[i]
            # Set max_item to the item
            max_item = i
    return max_item

# The following input values will be used for testing the solution.
# most_frequent(list1) should return 1.
list1 = [1, 3, 1, 3, 2, 1]
# most_frequent(list2) should return 3.
list2 = [3, 3, 1, 3, 2, 1]
# most_frequent(list3) should return None.
list3 = []
# most_frequent(list4) should return 0.
list4 = [0]
# most_frequent(list5) should return -1.
list5 = [0, -1, 10, 10, -1, 10, -1, -1, -1, 1]

print(most_frequent(list5))
