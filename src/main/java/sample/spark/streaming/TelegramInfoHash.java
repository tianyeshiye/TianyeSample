package sample.spark.streaming;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TelegramInfoHash implements Comparable<TelegramInfoHash> , Serializable{

	private static final long serialVersionUID = - 2022345678L;

    public final String deviceId;
    public final long timestamp;

    public final List<Short> CanId = new ArrayList<Short>();;

    public TelegramInfoHash( String deviceId, long timestamp) {
    	this.deviceId = deviceId;
    	this.timestamp = timestamp;

    }
	@Override
	public int compareTo(TelegramInfoHash other) {
		int r = this.deviceId.compareTo(other.deviceId);
		if (r == 0)
			r = Long.compare(this.timestamp, other.timestamp);
		return r;
	}

	@Override
	public int hashCode() {
		return this.deviceId.hashCode() ^ Long.hashCode(this.timestamp);
	}

	@Override
	public boolean equals(Object other) {
		return (other instanceof TelegramInfoHash) && this.compareTo((TelegramInfoHash)other) ==0;
	}

	@Override
	public String toString() {
		return new StringBuffer(this.deviceId + 1 + 8)
				.append(this.deviceId)
				.append('@')
				.append(Long.toHexString(this.timestamp))
				.toString();
	}
}
