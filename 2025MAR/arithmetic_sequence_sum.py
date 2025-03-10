total = 1000
a = 3
b = 5

def arithmetic_sequence_sum(numCount, standard, length):
    print("numCount: ", numCount)
    print("standard: ", standard)
    print("total: ", length)
    return numCount / 2 * (standard + length)

def sequence_pool(numCount, standard):
    return int(numCount / standard)

def lcm_sequence(num_a, num_b):
    if(num_a / num_b == int):
        return num_a
    elif(num_b / num_a == int):
        return num_b
    else:
        return num_a * num_b

a_sequence_pool = sequence_pool(total, a)
b_sequence_pool = sequence_pool(total, b)
lcm_sequence_pool = sequence_pool(total, lcm_sequence(a, b))

a_result = arithmetic_sequence_sum(a_sequence_pool, a, a_sequence_pool * a)
b_result = arithmetic_sequence_sum(b_sequence_pool, b, b_sequence_pool * b)
lcm_result = arithmetic_sequence_sum(lcm_sequence_pool, lcm_sequence(a, b), lcm_sequence_pool * lcm_sequence(a, b))

print("result: ", a_result)
print("result: ", b_result)
print("result: ", lcm_result)

print("---------------------------------")

print(a_result + b_result - lcm_result)
