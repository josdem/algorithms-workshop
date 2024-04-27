import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class InputStream implements Comparable<InputStream> {
    private final Integer streamId;
    private final Integer nextValue;

    public InputStream(Integer streamId, Integer nextValue) {
        this.streamId = streamId;
        this.nextValue = nextValue;
    }

    public Integer getStreamId() {
        return streamId;
    }

    public Integer getNextValue() {
        return nextValue;
    }

    @Override
    public int compareTo(InputStream that) {
        return this.getStreamId().compareTo(that.getStreamId());
    }

    @Override
    public String toString() {
        return this.getStreamId().toString();
    }
}

class OutputStream {

    void emitValue(int value) {
        System.out.println(value);
    }

}

public class StreamMerger {
    private final Set<InputStream> streams;

    StreamMerger(Set<InputStream> streams) {
        this.streams = streams;
    }

    void mergeInto(OutputStream stream) {
        TreeSet<InputStream> treeSet = new TreeSet<>(streams);
        treeSet.forEach(item -> stream.emitValue(item.getStreamId()));
    }

    public static void main(String[] args) {
        InputStream ist1 = new InputStream(2, 0);
        InputStream ist2 = new InputStream(1, 0);

        Set<InputStream> streams = new HashSet<InputStream>();
        streams.add(ist1);
        streams.add(ist2);

        new StreamMerger(streams).mergeInto(new OutputStream());
    }
}
