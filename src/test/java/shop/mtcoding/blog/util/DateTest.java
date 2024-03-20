package shop.mtcoding.blog.util;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.sql.Timestamp;

public class DateTest {

    @Test
    public void timestampFormat_test() {

        //given
        Timestamp currentTimestamp = new Timestamp(System.currentTimeMillis());
        //when
        String createdAt = MyDateUtil.timestampFormat(currentTimestamp);
        //then
        System.out.println("timestampFormat: " + createdAt);
    }

    @Test
    public void format_test() {

        Timestamp currentTimeStamp = new Timestamp(System.currentTimeMillis());

        Date currentDate = new Date(currentTimeStamp.getTime());

        String fomattedDate = DateFormatUtils.format(currentDate, "yyyy-MM-dd HH:mm");

        System.out.println("format_test: " + fomattedDate);

    }


}
