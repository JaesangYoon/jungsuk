package ch10;

import org.w3c.dom.ls.LSOutput;

import java.util.Calendar;

public class Ex10_2 {

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR) + "년 " + date.get(Calendar.MONTH) + "월 " + date.get(Calendar.DATE) + "일";
    }

    public static void main(String[] args) {
        // 요일은 1부터 시작하기 때문에 배열[0]은 비워두었다.
        final String[] DAY_OF_WEEK = {"", "일", "월", "화", "수", "목", "금", "토", "일"};

        Calendar date1 = Calendar.getInstance();
        Calendar date2 = Calendar.getInstance();

        System.out.println(date1); // 현재 날짜, 시간
        date1.set(2019, 3, 29);
        System.out.println(toString(date1) + " " + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일입니다.");
        System.out.println(toString(date2) + " " + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일입니다.");
//        System.out.println(date2);

        // 두 날짜간의 차이를 얻으려면, getTimeInMillis() 천분의 일초 단위로 변환해야 한다.









    }
}
