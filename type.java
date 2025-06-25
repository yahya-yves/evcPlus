import java.util.Scanner;

public class type {
    // Global variables
    static final String evc_plus = "*770#";
    static final int secret_pas = 2090;
    static double balance = 300;
    static int acount_Number = 788493244;
    static double ac_balance = 900;
    static final int ac_pass = 123456;
    static final int reference = 613013806;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("EVC\nGAli*770#");
        String evc = input.next();

        // Bilowga hore ee EVC
        if (evc.equals(evc_plus)) {
            displayMainMenu(input);
        }
    }

    // Methodka uu muujinayo menu-ga aasaasiga ah
    public static void displayMainMenu(Scanner input) {
        System.out.println("- EVCPLUS -");
        System.out.println("faldan geli pin-kaaga(Enter pin)");

        // Password verification
        verifyPassword(input);
    }

    // Methodka lagu check gareeyo password-ka
    public static void verifyPassword(Scanner input) {
        int user_sec = input.nextInt();
        if (secret_pas != user_sec) {
            System.out.println("fadlan numbersireedkaaga wakhalad");
        } else {
            showServicesMenu(input);
        }
    }

    // Methodka listiga ii mujinyo
    public static void showServicesMenu(Scanner input) {
        System.out.println("EVCPLUS");
        System.out.println("1. Itus Haraaga");
        System.out.println("2. kaarka hadalka");
        System.out.println("3. Bixi Biil");
        System.out.println("4.U wareeji EVCPLUS");
        System.out.println("5. Warbixin Kooban");
        System.out.println("6. Salaam Bank");
        System.out.println("7. Maareynta");
        System.out.println("8. TAAJ");
        System.out.println("9. Bill Payment");

        int dooro = input.nextInt();
        switch (dooro) {
            case 1:
                showBalance();
                break;
            case 2:
                AirtimeServices(input);
                break;
            case 3:
                BillPayment(input);
                break;
            case 4:
                Moneytransfer(input);
                break;
            case 5:
                warbixin(input);
                break;
            case 6:
                BankService(input);
                break;
            case 7:
                Management(input);
                break;
            case 8:
                TaajServices(input);
                break;
            case 9:
                BillPaymentOptinn(input);
                break;
            default:
                System.out.println("Number sax ah soo dooro");
        }
    }

    // Methodka ku mujinayo haraagaaga
    public static void showBalance() {
        System.out.println("[-EVCPLUS-] Haraagaagu waa $" + balance);
    }

    // Methodka logu maareeyo adeegyada airtime-ka
    public static void AirtimeServices(Scanner input) {
        System.out.println("Kaarka hadalka");
        System.out.println("1. Ku shubo Airtime");
        System.out.println("2. Ugu shubo Airtime");
        System.out.println("3. MIFI Packages");
        System.out.println("4. Ku shubo Internet");
        System.out.println("5. Ugu shub qof kale (MMT)");

        int kaarka_hadalka = input.nextInt();
        switch (kaarka_hadalka) {
            case 1:
                airtimeshuwasho(input);
                break;
            case 2:
                airtimesend(input);
                break;
            case 3:
                mifi(input);
                break;
            case 4:
                internett(input);
                break;
            case 5:
                transfer(input);
                break;
            default:
                System.out.println("Fadlan dooro number sax ah");
        }
    }

    // Methodka ku shuwashada  airtime ka
    public static void airtimeshuwasho(Scanner input) {
        System.out.println("Fadlan Gali lacagta");
        double kaarka_lacgta = input.nextDouble();
        System.out.println("Fadlan Geli numberka");
        int mob_kaarka = input.nextInt();
        System.out.println("Ma hubtaa inaad $" + kaarka_lacgta + " ku shubtid " + mob_kaarka + "?");
        System.out.println("1. haa");
        System.out.println("2. maya");

        int hubin = input.nextInt();
        if (hubin == 1) {
            if (balance >= kaarka_lacgta) {
                balance -= kaarka_lacgta;
                System.out.println("Waad guuleysatay inaad $" + kaarka_lacgta + " ku shubtid " + mob_kaarka);
                System.out.println("Haraagaga hada waa $" + balance);
            } else {
                System.out.println("Haraagagu kuma filno");
            }
        } else {
            System.out.println("OK");
        }
    }

    // Methodka markan qofkale ugu shuwayo airtimeka
    public static void airtimesend(Scanner input) {
        System.out.println("Fadlan Geli mobile-ka");
        int num_qofka = input.nextInt();
        System.out.println("Fadlan Geli lacagta");
        double qofka_lcgta = input.nextDouble();

        System.out.println("Ma hubtaa inaad $" + qofka_lcgta + " ku shubtid " + num_qofka + "?");
        System.out.println("1. haa");
        System.out.println("2. maya");

        int ugushubo_hubin = input.nextInt();
        if (ugushubo_hubin == 1) {
            if (balance >= qofka_lcgta) {
                balance -= qofka_lcgta;
                System.out.println("Waad guuleysatay inaad $" + qofka_lcgta + " ugu shubtid " + num_qofka);
                System.out.println("Haraagaga hada waa $" + balance);
            } else {
                System.out.println("Haraagagu kuma filno");
            }
        } else {
            System.out.println("OK");
        }
    }

    // Methodka mifi
    public static void mifi(Scanner input) {
        System.out.println("EVCPlus");
        System.out.println("1. Ku shubo Data-da MIFI");
        int data = input.nextInt();
        if (data == 1) {
            System.out.println("-Internet Bundle Recharge-");
            System.out.println("1. Isbuucle(Weekly)");
            System.out.println("2. maalinle(Daily)");
            System.out.println("3. Bille(MiFi)");

            int MIFI = input.nextInt();
            switch (MIFI) {
                case 1:
                    weaklyData(input);
                    break;
                case 2:
                    Dailydata(input);
                    break;
                case 3:
                    MonthlyData(input);
                    break;
                default:
                    System.out.println("Fadlan dooro number sax ah");
            }
        } else {
            System.out.println("Fadlan dooro number sax ah");
        }
    }

    // Methodka loo maareeyo weekly packages
    public static void weaklyData(Scanner input) {
        System.out.println("Fadlan dooro bundle ka");
        System.out.println("1. $5= 10 GB ");
        System.out.println("2. $10=25 GB ");

        int isbuucle = input.nextInt();
        switch (isbuucle) {
            case 1:
                rechargePackage(input, 5, "isbuucle");
                break;
            case 2:
                rechargePackage(input, 10, "isbuucle");
                break;
            default:
                System.out.println("Fadlan dooro number sax ah");
        }
    }

    // Methodka qeebta dailydata
    public static void Dailydata(Scanner input) {
        System.out.println("Fadlan dooro bundle ka");
        System.out.println("1. $1= 2 GB ");
        System.out.println("2. $2=5 GB ");

        int malinle = input.nextInt();
        switch (malinle) {
            case 1:
                rechargePackage(input, 1, "maalinle");
                break;
            case 2:
                rechargePackage(input, 2, "maalinle");
                break;
            default:
                System.out.println("Fadlan dooro number sax ah");
        }
    }

    // Methodka qieeybta billaha
    public static void MonthlyData(Scanner input) {
        System.out.println("Fadlan dooro bundle ka");
        System.out.println("1. $20= 40 GB ");
        System.out.println("2. $40=85 GB ");
        System.out.println("3. $60= 150 GB ");
        System.out.println("4. $30= monthly unlimit ");

        int bille = input.nextInt();
        switch (bille) {
            case 1:
                rechargePackage(input, 20, "bille");
                break;
            case 2:
                rechargePackage(input, 40, "bille");
                break;
            case 3:
                rechargePackage(input, 60, "bille");
                break;
            case 4:
                rechargePackage(input, 30, "monthly unlimit");
                break;
            default:
                System.out.println("Fadlan dooro number sax ah");
        }
    }

    // Methodka guud e ugu shubida userka
    public static void rechargePackage(Scanner input, double amount, String packageType) {
        System.out.println("Fadlan Gali MIFI user");
        int user = input.nextInt();
        System.out.println("Ma hubtaa inaad $" + amount + " ugu shubtid " + user + "?");
        System.out.println("1. haa");
        System.out.println("2. maya");

        int inpuT = input.nextInt();
        if (inpuT == 1) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Waad ku guuleysatay inaad ku shubtid $" + amount + " " + packageType + " ah");
                System.out.println("Haraagaga hada waa $" + balance);
            } else {
                System.out.println("Haraagagu kuma filno");
            }
        } else {
            System.out.println("OK");
        }
    }

    // Methodka list enternetka
    public static void internett(Scanner input) {
        System.out.println("Fadlan dooro number-ka ku shubeyso");
        System.out.println("1. Isbuucle(Weekly)");
        System.out.println("2.TIMES BASED PACKAGES");
        System.out.println("3. DATA");
        System.out.println("4. Maalinle (Daily)");
        System.out.println("5. Bille(MiFi)");

        int ku_shubo_intenet = input.nextInt();
        switch (ku_shubo_intenet) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                Internet(input);
                break;
            default:
                System.out.println("Fadlan dooro number sax ah");
        }
    }

    // Methodka qeybta kushubashada
    public static void Internet(Scanner input) {
        System.out.println("Fadlan geli lacagta");
        double amount = input.nextDouble();
        System.out.println("Fadlan gali mobile-ka");
        int mob_user = input.nextInt();

        System.out.println("Ma hubtaa inaad $" + amount + " ugu shubtid " + mob_user + "?");
        System.out.println("1. haa");
        System.out.println("2. maya");

        int confirmation = input.nextInt();
        if (confirmation == 1) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Waad ku guuleysatay inaad ku shubtid $" + amount + " data internet-ah");
                System.out.println("Haraagaga hada waa $" + balance);
            } else {
                System.out.println("Haraagagu kuma filno");
            }
        } else {
            System.out.println("OK");
        }
    }

    // Methodka marka lacag qof lagu wareejinayo (MMT)
    public static void transfer(Scanner input) {
        System.out.println("Fadlan soo geli mobile-ka");
        int qofka_kale = input.nextInt();
        System.out.println("Fadlan soo geli lacagta");
        double lcgta_qofka = input.nextDouble();

        System.out.println("Ma hubtaa inaad $" + lcgta_qofka + " ugu shubtid " + qofka_kale + "?");
        System.out.println("1. haa");
        System.out.println("2. maya");

        int hubin_dooro = input.nextInt();
        if (hubin_dooro == 1) {
            if (balance >= lcgta_qofka) {
                balance -= lcgta_qofka;
                System.out.println("Waad ku guuleysatay inaad ugu shubtid " + qofka_kale);
                System.out.println("Haraagaga hada waa $" + balance);
            } else {
                System.out.println("Haraagagu kuma filno");
            }
        } else {
            System.out.println("OK");
        }
    }

    // Methodka qeyba billpayment
    public static void BillPayment(Scanner input) {
        System.out.println("Bixi Biil");
        System.out.println("1. Post Paid  ");
        System.out.println("2.ku Iibso");

        int bixi_biil = input.nextInt();
        switch (bixi_biil) {
            case 1:
                PostPaid(input);
                break;
            case 2:
                buyingalaab(input);
                break;
            default:
                System.out.println("Fadlan dooro number sax ah");
        }
    }

    // Methodka qeybta  post paid bills
    public static void PostPaid(Scanner input) {
        System.out.println("Post Paid");
        System.out.println("1. Ogow biil");
        System.out.println("2. Bixi biil");
        System.out.println("3.Ka Bixi Biil");

        int post_paid = input.nextInt();
        switch (post_paid) {
            case 1:
                System.out.println("Haraagagu waa $" + balance);
                break;
            case 2:
                payBill(input);
                break;
            case 3:
                BillForOthers(input);
                break;
            default:
                System.out.println("Fadlan dooro number sax ah");
        }
    }

    // Methodka marka bixineyso billpayment
    public static void payBill(Scanner input) {
        System.out.println("Fadlan geli lacagta biil-ka");
        int biilka_lcgta = input.nextInt();
        System.out.println("Ma hubtaa inaa bixisid biil lacagtiisu tahay: $" + biilka_lcgta);
        System.out.println("1.haa ");
        System.out.println("2. maya");

        int ogoow_biil = input.nextInt();
        if (ogoow_biil == 1) {
            if (balance >= biilka_lcgta) {
                balance -= biilka_lcgta;
                System.out.println("Waad ku guuleysatay inaad bixiso biilka");
                System.out.println("Haraagagu hada waa $" + balance);
            } else {
                System.out.println("Haraagagu kuma filno");
            }
        } else {
            System.out.println("OK");
        }
    }

    // Methodka kabxineyso  qofkale   biil
    public static void BillForOthers(Scanner input) {
        System.out.println("Fadlan soo geli mobile-ka");
        int mob_bixi = input.nextInt();
        System.out.println("Fadlan geli lacgta");
        int lcgta_bixi = input.nextInt();
        System.out.println("Ma hubtaa inaad ka  bixisid bill lacagtiisu tahay: $" + lcgta_bixi + " oo laga rabo tell NO " + mob_bixi);
        System.out.println("1.haa");
        System.out.println("2. maya");

        int ka_bixi_biil = input.nextInt();
        if (ka_bixi_biil == 1) {
            if (balance >= lcgta_bixi) {
                balance -= lcgta_bixi;
                System.out.println("Waad ku guuleysatay inaad bixiso lacagta");
                System.out.println("Haraagagu hada waa $" + balance);
            } else {
                System.out.println("Haraagagu kuma filno");
            }
        } else {
            System.out.println("OK");
        }
    }

    // Methodka loo iibiyo alaab
    public static void buyingalaab(Scanner input) {
        System.out.println("Fadlan geli agoonsiga ganacsiga");
        double aqoonsi = input.nextDouble();
        if (aqoonsi == 1) {
            System.out.println("Fadlan Gali Number ka");
            int number = input.nextInt();
            System.out.println("Fadlan Gali lacagta");
            double money = input.nextDouble();
            System.out.println("Ma hubtaa inaad " + money + " udirto " + number + "\n" + "1.haa\n" + "2.maya");

            int ku_iibso = input.nextInt();
            if (ku_iibso == 1) {
                if (balance >= money) {
                    balance -= money;
                    System.out.println("Waad ku guuleysatay howshaan");
                    System.out.println("Haraagaagu waa $" + balance);
                } else {
                    System.out.println("Haraagagu kuma filno");
                }
            } else {
                System.out.println("Mahadsanid!");
            }
        } else {
            System.out.println("Aqoonsigaaga waa qalad");
        }
    }

    // Methodka markad lacag wareejin sameyneysid
    public static void Moneytransfer(Scanner input) {
        System.out.println("Fadlan geli mobile-ka");
        int tell = input.nextInt();
        System.out.println("Fadaln geli lacagta");
        double lcgta_uwareejinka = input.nextDouble();

        System.out.println("Ma hubtaa inaad $" + lcgta_uwareejinka + " ugu shubtid " + tell + "?");
        System.out.println("1. haa");
        System.out.println("2. maya");

        int hubin_uwareejida = input.nextInt();
        if (hubin_uwareejida == 1) {
            if (balance >= lcgta_uwareejinka) {
                balance -= lcgta_uwareejinka;
                System.out.println(lcgta_uwareejinka + " $ ayaad uwareejisay " + tell);
                System.out.println("Haraagaga hada waa $" + balance);
            } else {
                System.out.println("Haraagagu kuma filno");
            }
        } else {
            System.out.println("OK");
        }
    }

    // Methodka  muujinayo warbixin kooban
    public static void warbixin(Scanner input) {
        System.out.println("Warbixin Kooban");
        System.out.println("1. Last Action ");
        System.out.println("2. Wareejintii u dambeysay");
        System.out.println("3.Iibsashadii u dambeysay");
        System.out.println("4.Last 3 Action");
        System.out.println("5. Email Me My ACtivity");

        int warbixin_kooban = input.nextInt();
        switch (warbixin_kooban) {
            case 1:
                System.out.println("$100 Ayaad u wareejisay +252617337111, Taariikh: 1/10/10 16:07:15");
                break;
            case 2:
                wareejinta(input);
                break;
            case 3:
                // Iibsashadii u dambeysay - implementation neededka
                break;
            case 4:
                System.out.println("$100 Ayaad u wareejisay +252617337111, Taariikh: 1/10/10 16:07:55");
                System.out.println("$90 Ayaad u wareejisay +252617337111, Taariikh: 1/10/10 9:30:45");
                System.out.println("$101 Ayaad u wareejisay +252612101707, Taariikh: 1/10/10 6:0:5");
                break;
            case 5:
                System.out.println("Waxaan ka shaqeyneynaa codsigaaga, waxaana kuu soo diri doonnaa faahfaahinta iimayl ahaan: Yahye Abdisalan so'dal @gmail.com");
                break;
            default:
                System.out.println("Fadlan dooro number sax ah");
        }
    }

    // Methodka lagu  muujiyo statement-ga wareejinta
    public static void wareejinta(Scanner input) {
        System.out.println("Statementiga");
        System.out.println("1. U dirtay");
        System.out.println("2.kaheshay");

        int statement = input.nextInt();
        switch (statement) {
            case 1:
                System.out.println("Fadlan geli mobile-ka");
                int dirtay = input.nextInt();
                System.out.println("$10 Ayaad ka dirtay +252" + dirtay + ", Taariikh: 18/01/24 14:03:16");
                break;
            case 2:
                System.out.println("Fadlan geli mobile-ka");
                int kaheshay = input.nextInt();
                System.out.println("$10 Ayaad ka heshay +252" + kaheshay + ", Taariikh: 18/01/24 14:03:16");
                break;
            default:
                System.out.println("Fadlan dooro number sax ah");
        }
    }

    // Methodka lagu maareeyo adeegyada bangiga
    public static void BankService(Scanner input) {
        System.out.println("Salaam Bank");
        System.out.println("1. Itus haraaga");
        System.out.println("2. Lacag dhigasho");
        System.out.println("3. Lacag qaadasho");
        System.out.println("4. Ka wareeji EVCPlus");
        System.out.println("5. Ka wareeji Account-kaga");
        System.out.println("6. hubi wareeji account");
        System.out.println("7. Maareynta Bankiga");

        int salam_bank = input.nextInt();
        switch (salam_bank) {
            case 1:
                checkBankBalance(input);
                break;
            case 2:
                lacagdhigashoBank(input);
                break;
            case 3:
                moneytakeFromBank(input);
                break;
            case 4:
                transferFromEVCToBank(input);
                break;
            case 5:
                transferFromBankToAccount(input);
                break;
            case 6:
                hubinAccountTransfer(input);
                break;
            case 7:
                manageBankSettings(input);
                break;
            default:
                System.out.println("Fadlan dooro number sax ah");
        }
    }

    // Methodka lagu fiiriyo haraagaaga bangiga
    public static void checkBankBalance(Scanner input) {
        System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
        int num_sirta = input.nextInt();
        if (num_sirta == ac_pass) {
            System.out.println("Haraagaaga bangiga waa: $" + ac_balance);
        } else {
            System.out.println("Numberkaaga sirta ee bangiga waa qalad");
        }
    }

    // Methodka lagu dhigayo lacag bangiga
    public static void lacagdhigashoBank(Scanner input) {
        System.out.println("Fadlan geli lacagta");
        int lcg_dhigasho = input.nextInt();
        System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
        int num_sirt1 = input.nextInt();

        if (num_sirt1 == ac_pass) {
            System.out.println("Ma hubtaa inaad $" + lcg_dhigasho + " dhigatid account_kaaga bangiga?");
            System.out.println("1.haa");
            System.out.println("2.mya");

            int dhigasho_hubin = input.nextInt();
            if (dhigasho_hubin == 1) {
                ac_balance += lcg_dhigasho;
                System.out.println("USD " + lcg_dhigasho + " ayaa dhigatay koontadaada bangiga");
                System.out.println("Haraagaagu hada waa: $" + ac_balance);
            } else {
                System.out.println("OK");
            }
        } else {
            System.out.println("Numberkaaga sirta ee bangiga waa qalad");
        }
    }

    // Methodka markad  lacag bangiga kaqadaneyso
    public static void moneytakeFromBank(Scanner input) {
        System.out.println("Fadlan geli lacagta");
        int lcg_qaadasho = input.nextInt();
        System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
        int num_sirt2 = input.nextInt();

        if (num_sirt2 == ac_pass) {
            System.out.println("Ma hubtaa inaad $" + lcg_qaadasho + " qaadatid account_kaaga bangiga?");
            System.out.println("1.haa");
            System.out.println("2.mya");

            int lacag_qaadasho_hubin = input.nextInt();
            if (lacag_qaadasho_hubin == 1) {
                if (ac_balance >= lcg_qaadasho) {
                    ac_balance -= lcg_qaadasho;
                    System.out.println("USD " + lcg_qaadasho + " ayaa kala baxday koontadaada bangiga");
                    System.out.println("Haraagaagu hada waa: $" + ac_balance);
                } else {
                    System.out.println("Haraagaagu kuma filno");
                }
            } else {
                System.out.println("OK");
            }
        } else {
            System.out.println("Numberkaaga sirta ee bangiga waa qalad");
        }
    }

    // Methodka marka warejineyso lacag evc to bankiga
    public static void transferFromEVCToBank(Scanner input) {
        System.out.println("Fadlan soo dooro xisaabta bangiga");
        System.out.println("SALAAM SOMALI BANK");
        int salaam = input.nextInt();

        if (salaam == 1) {
            System.out.println("Fadlan soo geli account-ka");
            int account = input.nextInt();
            System.out.println("Fadlan geli macluumad");
            int macluumad = input.nextInt();
            System.out.println("Fadlan soo geli lacagta");
            double Lacagta = input.nextDouble();
            System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
            int num_sirt3 = input.nextInt();

            if (num_sirt3 == ac_pass) {
                System.out.println("Ma hubtaa inaa u dhigatay accounta NO:" + account + "?");
                System.out.println("1.Haa");
                System.out.println("2. Maya");

                int Dooro = input.nextInt();
                if (Dooro == 1) {
                    if (balance >= Lacagta) {
                        balance -= Lacagta;
                        ac_balance += Lacagta;
                        System.out.println("Waad ku guuleysatay inaa dhigato ACCOUNT NO:" + account);
                        System.out.println("Haraaga EVCPlus waa: $" + balance);
                        System.out.println("Haraaga bangiga waa: $" + ac_balance);
                    } else {
                        System.out.println("Haraagagu kuma filno");
                    }
                } else {
                    System.out.println("Mahadsanid!");
                }
            } else {
                System.out.println("Numberkaaga sirta ee bangiga waa qalad");
            }
        } else {
            System.out.println("Fadlan dooro number sax ah");
        }
    }

    // Methodka marka lacag  wareejiney lacag bangiga account kale
    public static void transferFromBankToAccount(Scanner input) {
        System.out.println("Fadlan soo geli account ama mobile");
        int account = input.nextInt();
        System.out.println("Fadlan soo geli lacagta");
        double Lcgta1 = input.nextDouble();
        System.out.println("Fadlan soo geli macluumad");
        String macluumad1 = input.next();
        System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
        int num_sirt4 = input.nextInt();

        if (num_sirt4 == ac_pass) {
            System.out.println("Ma hubtaa inaad USD" + Lcgta1 + " u wareejiso Bank Account NO:" + account + "?");
            System.out.println("1.Haa");
            System.out.println("2. Maya");

            int bixin = input.nextInt();
            if (bixin == 1) {
                if (ac_balance >= Lcgta1) {
                    ac_balance -= Lcgta1;
                    System.out.println("Waad ku guuleysatay inaad u wareejiso lacagtan");
                    System.out.println("Haraagaagu hada waa: $" + ac_balance);
                } else {
                    System.out.println("Haraagaagu kuma filno");
                }
            } else {
                System.out.println("Mahadsanid!");
            }
        } else {
            System.out.println("Numberkaaga sirta ee bangiga waa qalad");
        }
    }

    // Methodka lagu hubiyo wareejinta accounka
    public static void hubinAccountTransfer(Scanner input) {
        System.out.println("Fadlan geli OTP");
        int otp = input.nextInt();
        System.out.println("Ma hubtaa in aad aqbasho lacgta diridan");
        System.out.println("1.Haa");
        System.out.println("2.Maya");

        int otp_hubin = input.nextInt();
        if (otp_hubin == 1) {
            System.out.println("Waad ku guuleysatay inaa ku dirto lacgta account to account");
        } else {
            System.out.println("Mahadsanid!");
        }
    }

    // Methodka  qeybta sittings-ka bangiga
    public static void manageBankSettings(Scanner input) {
        System.out.println("Maareynta Bankiga");
        System.out.println("1. Bedel PIN-ka Bangiga");
        System.out.println("2.Bedel Passwordka Ebank");

        int maareynta = input.nextInt();
        switch (maareynta) {
            case 1:
                changeBankPIN(input);
                break;
            case 2:
                System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
                int num_sirt8 = input.nextInt();
                System.out.println("Error occurred, please try again later");
                break;
            default:
                System.out.println("Fadlan dooro number sax ah");
        }
    }

    // Methodka lagu bedelo PIN-ka bangiga
    public static void changeBankPIN(Scanner input) {
        System.out.println("Fadlan Geli numberkaaga sirta ee bangiga");
        int num_sirt5 = input.nextInt();
        System.out.println("Fadlan Geli pin-ka cusub ee bangiga");
        int num_sirt6 = input.nextInt();
        System.out.println("Hubi pin-ka cusub");
        int num_sirt7 = input.nextInt();

        if (num_sirt5 == ac_pass) {
            if (num_sirt6 != num_sirt5) {
                if (num_sirt6 == num_sirt7) {
                    System.out.println("Waad ku guuleysatay inaa badasho pin-kaaga bangiga");
                } else {
                    System.out.println("Fadlan iska hubi pin-kaga cusub");
                }
            } else {
                System.out.println("Fadlan iska hubi number sireed ka cusub inuusan la mid aheyn number sireed kaagi hore ee bangiga");
            }
        } else {
            System.out.println("Numberkaaga sirta ee bangiga waa qalad");
        }
    }

    // Methodka qeybta maareynta
    public static void Management(Scanner input) {
        System.out.println("Maareynta ");
        System.out.println("1.Bedel Lambarka Sirta");
        System.out.println("2. Bedel Luqadda");
        System.out.println("3. Wargellin Mobile Lumay");
        System.out.println("4. Lacag Xirasho");
        System.out.println("5. U celli Lacag Qaldantay");
        System.out.println("6. EnableMobileBanking");

        int Maareynta = input.nextInt();
        switch (Maareynta) {
            case 1:
                changePassword(input);
                break;
            case 2:
                changeLanguage(input);
                break;
            case 3:
                report_LostPhone(input);
                break;
            case 4:
                blockMoney(input);
                break;
            case 5:
                lacag_qaldantayTransaction(input);
                break;
            case 6:
                enableMobileBanking(input);
                break;
            default:
                System.out.println("Fadlan dooro number sax ah");
        }
    }

    // Methodka lagu bedelo password-ka
    public static void changePassword(Scanner input) {
        System.out.println("Fadlan Gelli PIN-Kaaga Cusub");
        int PIN_Cusub = input.nextInt();
        System.out.println("Hubi PIN-Kaaga Cusub");
        int Hubi_Cusub = input.nextInt();

        if (PIN_Cusub == Hubi_Cusub) {
            System.out.println("<-EVCPlus-> Waad Ku guuleysatay in aad badasho PIN-kaaga");
        } else {
            System.out.println("Kuma aadan Guleysan inaad badasho pinkaaga");
        }
    }

    // Methodka lagu bedelo luqadda
    public static void changeLanguage(Scanner input) {
        System.out.println("Falan Dooro luqada");
        System.out.println("1.English");
        System.out.println("2. Soomaali");

        int luqadda = input.nextInt();
        switch (luqadda) {
            case 1:
                System.out.println("<-EVCPlus-> you are succesfully changed your language");
                break;
            case 2:
                System.out.println("<-EVCPLus-> Waad ku guuleysatey inaad badasho luqadda");
                break;
            default:
                System.out.println("Fadlan dooro number sax ah");
        }
    }

    // Methodka lagu sheego telefoon lumay
    public static void report_LostPhone(Scanner input) {
        System.out.println("Fadlan Geli Mobile-ka lumay");
        int mobile_lumay = input.nextInt();
        System.out.println("Ma hubtaa in aad u diiwaan Geliso lumid number-kan " + mobile_lumay);
        System.out.println("1. haa");
        System.out.println("2. maya");

        int mob_lumay = input.nextInt();
        if (mob_lumay == 1) {
            System.out.println("Waad ku guuleysatay inaa u diiwan geliso mobile-lumay");
        } else {
            System.out.println("OK");
        }
    }

    // Methodka lagu xiro lacag
    public static void blockMoney(Scanner input) {
        System.out.println("Fadlan Geli numberka khalad ah");
        int num_khalad = input.nextInt();
        System.out.println("Faldan geli numberkii loo rabay");
        int num_loo_rabay = input.nextInt();

        if (num_khalad == num_loo_rabay) {
            System.out.println("Ma hubtaa inaa aad xirto lacagtan?");
            System.out.println("1. haa");
            System.out.println("2. maya");

            int Lacag_Xirasho = input.nextInt();
            if (Lacag_Xirasho == 1) {
                System.out.println("Waad ku guuleysatay inaa xirato lacagtaan");
            } else {
                System.out.println("OK");
            }
        } else {
            System.out.println("Dhaqdhaaqaan ma ahan mid jira");
        }
    }

    // Methodka lacag qaldantay lagu celiyo
    public static void lacag_qaldantayTransaction(Scanner input) {
        System.out.println("Fadlan Geli aqoonsiga lacag diridda");
        int mob_celis = input.nextInt();
        System.out.println("Ma hubtaa in aad celiso lacgtan? " + mob_celis);
        System.out.println("1.Haa");
        System.out.println("2.Maya");

        int hubinta_lacgta_celis = input.nextInt();
        if (hubinta_lacgta_celis == 1) {
            System.out.println("Waad ku guuleysatay inaa celiso lacagta");
        } else {
            System.out.println("OK");
        }
    }

    // Methodka lagu enable gareeyo mobile banking
    public static void enableMobileBanking(Scanner input) {
        System.out.println("Fadlan geli number-ka is diiwan gelinta");
        int num_is_diiwan = input.nextInt();
        System.out.println(num_is_diiwan + " Activation record was found");
    }

    // Methodka lagu maareeyo adeegyada TAAJ
    public static void TaajServices(Scanner input) {
        System.out.println("TAAJ\n" +
                "1. Gudaha\n" +
                "2. Dibadda\n" +
                "3. Ogoow Khidmada\n" +
                "4. Macluumadka xawaaladda\n" +
                "5. Jooji Xawaaladda\n" +
                "6. Fur Xawaaladda\n");

        int Taaj = input.nextInt();
        switch (Taaj) {
            case 1:
                mareyntaTransfer(input);
                break;
            case 2:
                InternationalTransfer(input);
                break;
            case 3:
                TaajInfo(input);
                break;
            case 4:
                TransferInformition(input);
                break;
            case 5:
                stopTransfer(input);
                break;
            case 6:
                enableTransfer(input);
                break;
            default:
                System.out.println("Fadlan dooro number sax ah");
        }
    }

    // Methodka lagu maareeyo wareejinta gudaha
    public static void mareyntaTransfer(Scanner input) {
        System.out.println("Fadlan dooro shirkada\n" +
                "1. E-KAAFI\n" +
                "2. E-SAHAL");
        int shirkada = input.nextInt();
        input.nextLine();

        System.out.println("Fadlan Geli Taleefanka qaataha");
        int talefanka = input.nextInt();
        input.nextLine();

        System.out.println("Fadlan Geli Magaca qaataha oo seddexan");
        String FullName = input.nextLine();

        System.out.println("Fadlan Geli Magaalada qaataha uu joogo");
        String magaalada = input.nextLine();

        System.out.println("Fadlan Geli lacagta");
        int lacagta = input.nextInt();
        System.out.println("Khidmada ma xisaabtada ayaa laga jarayaa?\n" +
                "1. Haa\n" +
                "2. Maya");
        int confirm = input.nextInt();

        if (confirm == 1) {
            ac_balance -= lacagta;
            if (ac_balance < lacagta) {
                System.out.println("Haraagaagu kuguma filna");
            } else {
                System.out.println("Waxaad lacag $" + lacagta + " u dhigtay TAAJ " + FullName +
                        " oo joogo magaalada " + magaalada + ". Haraaga kontadan " + acount_Number +
                        " waa $" + ac_balance);
            }
        } else {
            System.out.println("Lacag lama jarin. Waad ka laabatay.");
        }
    }

    // Methodka loo maareeyo wareejinta dibadda
    public static void InternationalTransfer(Scanner input) {
        System.out.println("Fadlan Geli Taleefanka qaataha");
        int talefanka = input.nextInt();
        input.nextLine();
        System.out.println("Fadlan Geli Magaca qaataha oo seddexan");
        String FullName = input.nextLine();
        System.out.println("Fadlan Geli Magaalada qaataha uu joogo");
        String magalada = input.nextLine();
        System.out.println("Fadlan Geli Lacagta");
        int lacag = input.nextInt();
        System.out.println("Fadlan Geli Macluumaad");
        lacag = input.nextInt();
        System.out.println("Khidmada ma xisaabtada ayaa laga jarayaa\n1.Haa \n2. Maya ");
        int confirm = input.nextInt();

        if (confirm == 1) {
            System.out.println("Ma hubtaa inaad $" + lacag + " u dirtid" + FullName + " oo wata taleefoonka " + talefanka + "?");
            System.out.println("1.Haa");
            System.out.println("2.Maya");

            confirm = input.nextInt();
            if (confirm == 1) {
                ac_balance -= lacag;
                if (ac_balance < lacag) {
                    System.out.println("Haraagaagu kuguma filna");
                } else {
                    System.out.println("waxaad $" + lacag + " u dirtay" + FullName + " oo wata taleefoonka " +
                            talefanka + " Haraagagu waa " + ac_balance);
                }
            } else {
                System.out.println("Mahadsanid!");
            }
        } else {
            System.out.println("Mahadsanid!");
        }
    }

    // Methodka lagu muujiyo macluumaadka TAAJ
    public static void TaajInfo(Scanner input) {
        System.out.println("Fadlan dooro shirkada\n" +
                "1. PAY TO EVCPLUS TMT\n" +
                "2. TAAJ\n" +
                "3. TaajPay\n" +
                "4. New Etaaj\n" +
                "5.TAAJ IPS");

        int Ips = input.nextInt();
        if (Ips < 1 || Ips > 5) {
            System.out.println("Fadlan dooro number sax ah");
            return;
        }

        System.out.println("Fadlan Geli Taleefanka qaataha");
        int taleefanka = input.nextInt();
        System.out.println("Fadlan Geli lacagta");
        int lacagta = input.nextInt();
        System.out.println("mahubtaa inaad $" + lacagta + " " + "u dirto tel No " + taleefanka);
        System.out.println("1.Haa");
        System.out.println("2.Maya");

        int confirm = input.nextInt();
        if (confirm == 1) {
            ac_balance -= lacagta;
            if (ac_balance < lacagta) {
                System.out.println("Haraaga koontadan" + " " + acount_Number + " " + "kuma filna");
                return;
            }
            System.out.println("Waxaad $" + lacagta + " " + "u dirtay tell No " + " " + taleefanka +
                    "haraagaagu waa" + ac_balance);
        } else {
            System.out.println("Mahadsanid");
        }
    }

    // Methodka lagu muujiyo macluumaadka xawaaladda
    public static void TransferInformition(Scanner input) {
        System.out.println("Fadlan Geli aqoonsiga lacag diridda");
        int aqoonsiga = input.nextInt();
        int macluumad = 0;

        while (macluumad != aqoonsiga) {
            System.out.println("Fadlan Geli Macluumaad");
            macluumad = input.nextInt();
            if (macluumad != aqoonsiga) {
                System.out.println("Invalid Input match (length)");
                return;
            } else if (macluumad == aqoonsiga) {
                System.out.println("Mahubtaa in aad xirto aqoonsiga xawilaada" + aqoonsiga + "?");
                System.out.println("1.Haa");
                System.out.println("1.Maya");

                int confirm = input.nextInt();
                if (confirm == 1) {
                    System.out.println("Waxaad xirtay" + " " + "aqoonsiga xawilaada " + " " + aqoonsiga);
                } else {
                    System.out.println("Mahadsanid");
                }
            }
        }
    }

    // Methodka lagu joojiyo xawaaladda
    public static void stopTransfer(Scanner input) {
        System.out.println("Fadlan Geli aqoonsiga lacag diridda");
        int aqoonsiga1 = input.nextInt();
        int macluumad1 = 0;

        while (macluumad1 != aqoonsiga1) {
            System.out.println("Fadlan Geli Macluumaad");
            macluumad1 = input.nextInt();
            if (macluumad1 != aqoonsiga1) {
                System.out.println("Invalid Input match (length)");
                return;
            } else if (macluumad1 == aqoonsiga1) {
                System.out.println("Mahubtaa in aad xirto aqoonsiga xawilaada" + aqoonsiga1 + "?");
                System.out.println("1.Haa");
                System.out.println("1.Maya");

                int confirm = input.nextInt();
                if (confirm == 1) {
                    System.out.println("Waxaad xirtay" + " " + "aqoonsiga xawilaada " + " " + aqoonsiga1);
                } else {
                    System.out.println("Mahadsanid");
                }
            }
        }
    }

    // Methodka lagu furo xawaaladda
    public static void enableTransfer(Scanner input) {
        System.out.println("Fadlan Geli aqoonsiga lacag diridda");
        int aqoonsiga1 = input.nextInt();
        int macluumad1 = 0;

        while (macluumad1 != aqoonsiga1) {
            System.out.println("Fadlan Geli Macluumaad");
            macluumad1 = input.nextInt();
            if (macluumad1 != aqoonsiga1) {
                System.out.println("Invalid Input match (length)");
                return;
            } else if (macluumad1 == aqoonsiga1) {
                System.out.println("Mahubtaa in aad lacag u dirto aqoonsiga xawilaada" + aqoonsiga1 + "?");
                System.out.println("1.Haa");
                System.out.println("1.Maya");

                int confirm = input.nextInt();
                if (confirm == 1) {
                    System.out.println("Waxaad lacag u dirtay" + " " + "aqoonsiga xawilaada " + " " + aqoonsiga1);
                } else {
                    System.out.println("Mahadsanid");
                }
            }
        }
    }

    // Methodka lagu maareeyo bill payment
    public static void BillPaymentOptinn(Scanner input) {
        System.out.println("EVCPlus");
        System.out.println("1. itus haraaaga bill ka\n2. Wada Bixi bill ka\n3. Qayb ka bixi Bill");

        int BixiBill = input.nextInt();
        if (BixiBill < 1 || BixiBill > 3) {
            System.out.println("Fadlan dooro number sax ah");
            return;
        } else {
            if (BixiBill == 1) {
                checkBillBalance(input);
            } else if (BixiBill == 2) {
                payFullBill(input);
            } else if (BixiBill == 3) {
                payPartilBill(input);
            }
        }
    }

    // Methodka lagu eego haraaga bill-ka
    public static void checkBillBalance(Scanner input) {
        System.out.println("Fadlan Geli bill reference number");
        int user_reference = input.nextInt();

        if (reference != user_reference) {
            System.out.println("some parameters are missing. please check your request");
        } else {
            System.out.println("Haraagaaga bill ku waa $" + balance);
        }
    }

    // Methodka lagu bixiyo billka dhan
    public static void payFullBill(Scanner input) {
        System.out.println("Fadlan Geli bill reference number");
        int user_reference = input.nextInt();

        if (reference != user_reference) {
            System.out.println("some parameters are missing. please check your request");
        } else {
            System.out.println("Fadlan Geli lagacta bill ka");
            int lacagtaBillka = input.nextInt();
            System.out.println("Ma hubtaa in aad wada bixisay lacagta bill ka una udirtay " + user_reference);
            System.out.println("1.Haa");
            System.out.println("2.Maya");

            int confirm = input.nextInt();
            if (confirm == 1) {
                balance -= lacagtaBillka;
                if (lacagtaBillka < 1 || lacagtaBillka > balance) {
                    System.out.println("Haraagaagu kuguma filna");
                    return;
                }
                System.out.println("waxaad wada bixisay lacagta bill ka waxaad na udirtay " + user_reference + " haraagaagu waa $" + balance);
            } else {
                System.out.println("Mahadsanid!");
            }
        }
    }

    // Methodka lagu bixiyo qayb bill ah
    public static void payPartilBill(Scanner input) {
        System.out.println("Fadlan Geli bill reference number");
        int user_reference = input.nextInt();

        if (reference != user_reference) {
            System.out.println("some parameters are missing. please check your request");
        } else {
            System.out.println("Fadlan Geli lagacta bill ka");
            int lacagtaBillka = input.nextInt();
            System.out.println("Ma hubtaa in aad Qayb ka bixisay lacagta bill ka una udirtay " + user_reference);
            System.out.println("1.Haa");
            System.out.println("2.Maya");

            int confirm = input.nextInt();
            if (confirm == 1) {
                balance -= lacagtaBillka;
                if (lacagtaBillka < 1 || lacagtaBillka > balance) {
                    System.out.println("Haraagaagu kuguma filna");
                    return;
                }
                System.out.println("waxaad Qayb ka bixisay lacagta bill ka waxaad na udirtay " + user_reference + " haraagaagu waa $" + balance);
            } else {
                System.out.println("Mahadsanid!");
            }
        }
    }
}