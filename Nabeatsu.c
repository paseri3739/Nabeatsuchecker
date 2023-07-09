#include <stdio.h>

int is_multiple(int num)
{
    if (num % 3 != 0)
    {
        return 0;
    }
    return 1;
}

int has_three(int num)
{
    while (num > 0)
    {
        if (num % 10 == 3)
        {
            return 1;
        }
        num /= 10;
    }
    return 0;
}

void print_ismultiple(int ismultiple)
{
    if (ismultiple == 0)
    {
        printf("3の倍数ではありません\n");
    }
    else
    {
        printf("3の倍数です\n");
    }
}

void print_has_three(int hasthree)
{
    if (hasthree == 0)
    {
        printf("3が含まれていません\n");
    }
    else
    {
        printf("3が含まれています\n");
    }
}

int main()
{
    int roop = 1;

    do
    {
        int is_multiple_val = 0;
        int has_three_val = 0;

        printf("数字を入力してください：");
        int input;
        scanf("%d", &input);

        is_multiple_val = is_multiple(input);
        has_three_val = has_three(input);

        print_ismultiple(is_multiple_val);
        print_has_three(has_three_val);

        printf("続けますか？ 1で継続、2で終了：");
        int exit;
        scanf("%d", &exit);

        if (exit == 2)
        {
            roop = 0;
        }
    } while (roop);

    return 0;
}
