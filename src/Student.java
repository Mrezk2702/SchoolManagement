public class Student {

    private String name;
    private String year;
    private int englishGrade;
    private int arabicGrade;
    private int mathsGrade;
    private int scienceGrade;
    private int historyGrade;

    private double totalPercentage;

    public double getTotalPercentage() {
        return totalPercentage;
    }

    private void calcTotalPercentage() {
        this.totalPercentage = (this.englishGrade+this.arabicGrade+
                this.historyGrade+this.mathsGrade+this.scienceGrade)/5.0;
    }

    public Student(String name, String year, int englishGrade, int arabicGrade, int mathsGrade, int scienceGrade, int historyGrade) {
        this.name = name;
        this.year = year;
        this.englishGrade = englishGrade;
        this.arabicGrade = arabicGrade;
        this.mathsGrade = mathsGrade;
        this.scienceGrade = scienceGrade;
        this.historyGrade = historyGrade;
        calcTotalPercentage();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public int getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(int englishGrade) {
        this.englishGrade = englishGrade;
    }

    public int getArabicGrade() {
        return arabicGrade;
    }

    public void setArabicGrade(int arabicGrade) {
        this.arabicGrade = arabicGrade;
    }

    public int getMathsGrade() {
        return mathsGrade;
    }

    public void setMathsGrade(int mathsGrade) {
        this.mathsGrade = mathsGrade;
    }

    public int getScienceGrade() {
        return scienceGrade;
    }

    public void setScienceGrade(int scienceGrade) {
        this.scienceGrade = scienceGrade;
    }

    public int getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(int historyGrade) {
        this.historyGrade = historyGrade;
    }

    public void setTotalPercentage(double totalPercentage) {
        this.totalPercentage = totalPercentage;
    }

    public void printStudentData()
    {
        System.out.print(this.name+"\t"+this.year+"\t"+this.arabicGrade+"\t");
        System.out.print(this.englishGrade+"\t"+this.mathsGrade+"\t"+this.scienceGrade+"\t");
        System.out.println(this.historyGrade+"\t"+this.totalPercentage+"%");


    }
}
