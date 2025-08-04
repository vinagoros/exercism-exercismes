public class SalaryCalculator {
    int baseSalary = 1000;
    public double salaryMultiplier(int daysSkipped) {
        double baseMultiplier = 1.0;
        return  daysSkipped > 4  ?  0.85 : baseMultiplier;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double multiplier = salaryMultiplier(daysSkipped);
        double sellIncome = bonusForProductsSold(productsSold);
        double calculatedIncome = (baseSalary * multiplier) + sellIncome;
        return calculatedIncome > 2000 ? 2000.0 : calculatedIncome;
    } 
}
