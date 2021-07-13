package ru.pavel.domain;

public class BankingProducts {
    private String name;
    private String currency;
    private double balance;

    public BankingProducts(String name, String currency, double balance) {
        this.name = name;
        this.currency = currency;
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public String getCurrency() {
        return this.currency;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof BankingProducts)) return false;
        final BankingProducts other = (BankingProducts) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$name = this.getName();
        final Object other$name = other.getName();
        if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
        final Object this$currency = this.getCurrency();
        final Object other$currency = other.getCurrency();
        if (this$currency == null ? other$currency != null : !this$currency.equals(other$currency)) return false;
        if (Double.compare(this.getBalance(), other.getBalance()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof BankingProducts;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $name = this.getName();
        result = result * PRIME + ($name == null ? 43 : $name.hashCode());
        final Object $currency = this.getCurrency();
        result = result * PRIME + ($currency == null ? 43 : $currency.hashCode());
        final long $balance = Double.doubleToLongBits(this.getBalance());
        result = result * PRIME + (int) ($balance >>> 32 ^ $balance);
        return result;
    }

    public String toString() {
        return "BankingProducts(name=" + this.getName() + ", currency=" + this.getCurrency() + ", balance=" + this.getBalance() + ")";
    }
}
