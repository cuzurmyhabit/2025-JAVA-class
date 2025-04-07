package Ex02;
import java.util.Calendar;

public class CalendarEx {
    // 날짜 및 시간 정보를 포맷에 맞춰 출력하는 메서드
    public static void printCalendar(String msg, Calendar cal) {
        int year = cal.get(Calendar.YEAR); // 연도
        int month = cal.get(Calendar.MONTH) + 1; // 월 (0부터 시작하므로 +1)
        int day = cal.get(Calendar.DAY_OF_MONTH); // 일
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 요일 (1~7: 일~토)
        int hour = cal.get(Calendar.HOUR); // 시 (12시간제)
        int hourOfDay = cal.get(Calendar.HOUR_OF_DAY); // 시 (24시간제)
        int ampm = cal.get(Calendar.AM_PM); // 오전/오후 구분 (0: 오전, 1: 오후)
        int minute = cal.get(Calendar.MINUTE); // 분
        int second = cal.get(Calendar.SECOND); // 초
        int millisecond = cal.get(Calendar.MILLISECOND); // 밀리초

        // 날짜 출력
        System.out.print(msg + year + "/" + month + "/" + day + "/");

        // 요일에 따라 출력
        switch(dayOfWeek) {
            case Calendar.SUNDAY : System.out.print("일요일"); break;
            case Calendar.MONDAY : System.out.print("월요일"); break;
            case Calendar.TUESDAY : System.out.print("화요일"); break;
            case Calendar.WEDNESDAY : System.out.print("수요일"); break;
            case Calendar.THURSDAY : System.out.print("목요일"); break;
            case Calendar.FRIDAY : System.out.print("금요일"); break;
            case Calendar.SATURDAY : System.out.print("토요일"); break;
        }

        // 시간 출력 (24시간제 기준)
        System.out.print("(" + hourOfDay + "시)");

        // 오전/오후 출력
        if (ampm == Calendar.AM)
            System.out.print("오전");
        else
            System.out.print("오후");

        // 시, 분, 초, 밀리초 출력
        System.out.println(hour + "시 " + minute + "분 " + second + "초 "
                + millisecond + "밀리초");
    }

    public static void main(String[] args) {
        // 현재 날짜와 시간 가져오기
        Calendar now = Calendar.getInstance();
        printCalendar("현재 ", now);

        // 특정 날짜(처음 데이트한 날)를 설정
        Calendar firstDate = Calendar.getInstance();
        firstDate.clear(); // 모든 값 초기화

        // 2016년 12월 25일 설정 (12월은 11로 설정해야 함: 0부터 시작)
        firstDate.set(2016, 11, 25);

        // 시간 설정: 20시 30분 (저녁 8시 30분)
        firstDate.set(Calendar.HOUR_OF_DAY, 20);
        firstDate.set(Calendar.MINUTE, 30);

        printCalendar("처음 데이트한 날은 ", firstDate);
    }
}

