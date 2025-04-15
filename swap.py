def swap(a, b):
    swap_list = []
    temp, a, b = a, b, a # Swapping the values using variable unpacking
    swap_list.append(a)
    swap_list.append(b)
    return swap_list

def main():
    a = int(input("Enter first number: "))
    b = int(input("Enter second number: "))
    swap(a, b)
    for i in swap(a, b):
        print(i)

if __name__ == "__main__":
    main()