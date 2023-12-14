import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ByteUtilTest {

    ByteUtil byteUtil = new ByteUtil();

    @Test
    void byteArr2LongMax() {
        byte[] arr = new byte[8];
        Arrays.fill(arr, Byte.MAX_VALUE);
        long l = byteUtil.byteArr2Long(arr);
        assertArrayEquals(arr, byteUtil.longToBytes(l));
    }

    @Test
    void byteArr2LongMin() {
        byte[] arr = new byte[8];
        Arrays.fill(arr, (byte) 0);
        assertArrayEquals(arr, byteUtil.longToBytes(byteUtil.byteArr2Long(arr)));
    }

    @Test
    void byteArr2ByteList() {
        byte[] arr = new byte[8];
        Arrays.fill(arr, Byte.MAX_VALUE);
        var result = byteUtil.byteArr2List(arr);
        result.forEach(each -> assertEquals(Byte.MAX_VALUE, each));
    }

    @Test
    void byteList2Arr() {
        List<Byte> highBytes = new ArrayList<>();
        highBytes.add(Byte.MIN_VALUE);
        highBytes.add(Byte.MAX_VALUE);
        byte[] arr = byteUtil.byteList2Arr(highBytes);
        assertEquals(Byte.MIN_VALUE, arr[0]);
        assertEquals(Byte.MAX_VALUE, arr[1]);
    }

}