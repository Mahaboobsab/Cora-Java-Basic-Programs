class ReverseGivenNoDemo
{
public static int main(String args[])
{
	int revNum = 0;
	int num=1234;
	while (num > 0) {
            int rem = num % 10;
            revNum = (revNum * 10) + rem;
            num = num / 10;
        }
        return revNum;
}
}

