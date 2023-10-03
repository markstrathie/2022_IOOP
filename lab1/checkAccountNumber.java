void checkAccountNumber(int[] account) {
	System.out.print("Checking account: ");
	for (int digit : account) {
		System.out.print(digit);
	}
	System.out.println();

	//bank arrays
	int[] batwest = new int[] {4,3,3,4,2,1};
	int[] boyds = new int[] {2,0,0,1,2,3};

	//checking bank identity
	int[] bankNo = Arrays.copyOfRange(account,0,6);
	System.out.println(Arrays.toString(bankNo));
	System.out.println(Arrays.toString(batwest));
	boolean retval = Arrays.equals(bankNo,batwest);
	boolean retval2 = Arrays.equals(bankNo,boyds);
	if (retval == true) {
		System.out.println("The bank managing the account is batwest");
	} else if (retval2 == true) {
		System.out.println("The bank managing the account is boyds");
	} else {
		System.out.println("The bank managing the account is unrecognised");
	}

	//checking personal account no.
	int[] personalNo = Arrays.copyOfRange(account,6,15);
	int checksum = account[15];
	int counter = 0;
	boolean personalValid = true;
	for (int digit : personalNo) {
		if (digit != 0) {
			counter++;
		}
		if (digit < 0 || digit > 9) {
			personalValid = false;
		}
	}
	if (checksum == counter && personalValid) {
		System.out.println("Personal account number valid");
	} else {
		System.out.println("Personal account number not valid");
	}

	//checking account no.
	if (personalValid && (retval == true || retval2 == true)) {
		System.out.println("Account number valid");
	} else {
		System.out.println("Account number not valid");
	}
}
