import java.util.Set;
import java.util.HashSet;

class InputStream implements Comparable<InputStream>{
  private Integer streamId;
  private Integer nextValue;

  public InputStream(Integer streamId, Integer nextValue){
    this.streamId = streamId;
    this.nextValue = nextValue;
  }

  public Integer getStreamId(){
    return streamId;
  }

  public Integer getNextValue(){
    return nextValue;
  }

  @Override
  public int compareTo(InputStream that){
    return this.getStreamId().compareTo(that.getStreamId());
  }
}

class OutputStream {

  void emitValue(int value){}

}

public class StreamMerger {
  private Set<InputStream> streams;

  public StreamMerger(Set<InputStream> streams){
    this.streams = streams;
  }

  public void mergeInto(OutputStream stream){
  }

  public static void main(String[] args){
    new StreamMerger(new HashSet<InputStream>());
  }
}
