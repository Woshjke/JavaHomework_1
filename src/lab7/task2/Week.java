package lab7.task2;

public enum Week {
        MONDAY("Mon"),
        TUESDAY("Tue"),
        WEDNESDAY("Wen"),
        THURSDAY("Thu"),
        FRIDAY("Fri"),
        SATURDAY("Sat"),
        SUNDAY("Sun");

        String abbreviation;

        Week(String abbreviation) {
            this.abbreviation = abbreviation;
        }

        public String getAbbreviation() {
            return this.abbreviation;
        }

        public boolean isWeekend() {
            return this.equals(Week.SATURDAY) || this.equals(Week.SUNDAY);
        }

        public String getText() {
            return this.name();
        }
}
