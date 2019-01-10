package lesson9.utils;

public class Checker {
    //public
    //private
    //default (package-private)
    //protected

    //private
    //default (package-private)
    //protected
    //public

    int companyNameValidatedCount = 0;

    public boolean checkCompanyName(String companyName) {

//        if (companyName == "Google" || companyName == "Amazone")
//            return false;
//        return true;
        if (companyNameValidatedCount > 10)
            return false;

        companyNameValidatedCount++;
        return  companyName != "Google" && companyName != "Amazon";
    }
}
