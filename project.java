import java.util.*;
class Project
{
	public static void main(String s[])
	{
		int username,pwd,username1,pwd1,withdraw,d,c=0;
		int ch,ch2,ch3;
		username=1234;
		pwd=123;
		int bal2=0,bal=0;
		System.out.println("Enter the user name and password");
		Scanner kb=new Scanner(System.in);
		username1=kb.nextInt();
		pwd1=kb.nextInt();

		if(username==username1&&pwd==pwd1)
		{
				System.out.println("Succesfull");
				System.out.println("Enter\n 1. Checking\n 2. Savings\n 3. Exit");
				ch=kb.nextInt();

				do
				{
						switch(ch)
						{
								case 1:
								System.out.println("Enter \n 1. View Balance\n 2. Withdraw fund \n 3. Deposite Funds\n 4.Exit");
								ch2=kb.nextInt();
								switch(ch2)
								{
										case 1:
											System.out.println("The balance is "+bal);
											break;

											case 2:
											System.out.println("Enter the amount to withdraw");
											withdraw=kb.nextInt();

											if(withdraw>bal)
												System.out.println("Error");
											else
											{
												bal=bal-withdraw;
												System.out.println("The Withdraw amount is "+bal);
											}
											break;

											case 3:
												System.out.println("Enter the amount you want to Deposite ");
												d=kb.nextInt();
												bal=bal+d;
												System.out.println("Entered amount is "+bal);
											break;
											
											case 4:
											System.exit(0);
											break;

											
								}
						
								break;

								case 2:
								System.out.println("Enter \n 1. View Balance\n 2. Withdraw fund \n 3. Deposite Funds\n 4.Exit");
								ch3=kb.nextInt();
								switch(ch3)
								{
										case 1:
											System.out.println("The balance is "+bal2);
											break;

											case 2:
											System.out.println("Enter the amount to withdraw");
											withdraw=kb.nextInt();

											if(withdraw>bal2)
												System.out.println("Error");
											else
											{
												bal2=bal2-withdraw;
												System.out.println("The Withdraw amount is "+bal2);
											}
											break;

											case 3:
												System.out.println("Enter the amount you want to Deposite ");
												d=kb.nextInt();
												bal2=bal2+d;
												System.out.println("Entered amount is "+bal2);
											break;
											
											case 4:
											System.exit(0);
											break;

											
								}
						
								break;

								case 3:
								System.exit(0);

					}System.out.println("Do you want to continue .Press 1 for continue and 0 for exit");
  										c=kb.nextInt();
				}while(c==1);
			}
else
System.out.println("Username password is wrong");

		}
	}
