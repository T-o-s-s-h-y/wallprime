# coding:utf-8

def wall_prime(n):
    i = 2
    # 素因数分解の結果を格納する配列
    factors = []
    # 素因数分解
    while i * i <= n:
        if n % i:
            i += 1
        else:
            n //= i
            factors.append(i)
    if n > 1:
        factors.append(n)
    return factors

if __name__ == '__main__':
    print(wall_prime(28050))