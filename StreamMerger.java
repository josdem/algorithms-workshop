import java.util.Set;
import java.util.HashSet;

class InputStream {
  int streamId;
  int nextValue;

  int getStreamId(){
    return streamId;
  }

  int getNextValue(){
    return nextValue;
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
