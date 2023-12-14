import java.nio.ByteBuffer;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ByteUtil {
    public long byteArr2Long(byte[] arr) {
        long s;
        long s0 = arr[0] & 0xff;
        long s1 = arr[1] & 0xff;
        long s2 = arr[2] & 0xff;
        long s3 = arr[3] & 0xff;
        long s4 = arr[4] & 0xff;
        long s5 = arr[5] & 0xff;
        long s6 = arr[6] & 0xff;
        long s7 = arr[7] & 0xff;

        s1 <<= 8;
        s2 <<= 16;
        s3 <<= 24;
        s4 <<= 8 * 4;
        s5 <<= 8 * 5;
        s6 <<= 8 * 6;
        s7 <<= 8 * 7;
        s = s0 | s1 | s2 | s3 | s4 | s5 | s6 | s7;
        return s;

    }

    public byte[] longToBytes(long x) {
        ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);
        buffer.putLong(x);
        return buffer.array();
    }

    public List<Byte> byteArr2List(byte[] arr) {
        return IntStream.range(0, arr.length).mapToObj(i -> arr[i]).collect(Collectors.toList());
    }

    public byte[] byteList2Arr(List<Byte> bytes) {
        int size = bytes.size();
        byte[] byteArr = new byte[size];
        for (int index = 0; index < size; index++) {
            byteArr[index] = bytes.get(index);
        }
        return byteArr;
    }
}
