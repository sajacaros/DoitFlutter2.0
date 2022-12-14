// Autogenerated from Pigeon (v4.2.10), do not edit directly.
// See also: https://pub.dev/packages/pigeon

package io.flutter.plugins;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**Generated class from Pigeon. */
@SuppressWarnings({"unused", "unchecked", "CodeBlock2Expr", "RedundantSuppression"})
public class DeviceInfoService {

  /** Generated class from Pigeon that represents data sent in messages. */
  public static class DeviceInfo {
    private @Nullable String device;
    public @Nullable String getDevice() { return device; }
    public void setDevice(@Nullable String setterArg) {
      this.device = setterArg;
    }

    private @Nullable String brand;
    public @Nullable String getBrand() { return brand; }
    public void setBrand(@Nullable String setterArg) {
      this.brand = setterArg;
    }

    public static final class Builder {
      private @Nullable String device;
      public @NonNull Builder setDevice(@Nullable String setterArg) {
        this.device = setterArg;
        return this;
      }
      private @Nullable String brand;
      public @NonNull Builder setBrand(@Nullable String setterArg) {
        this.brand = setterArg;
        return this;
      }
      public @NonNull DeviceInfo build() {
        DeviceInfo pigeonReturn = new DeviceInfo();
        pigeonReturn.setDevice(device);
        pigeonReturn.setBrand(brand);
        return pigeonReturn;
      }
    }
    @NonNull Map<String, Object> toMap() {
      Map<String, Object> toMapResult = new HashMap<>();
      toMapResult.put("device", device);
      toMapResult.put("brand", brand);
      return toMapResult;
    }
    static @NonNull DeviceInfo fromMap(@NonNull Map<String, Object> map) {
      DeviceInfo pigeonResult = new DeviceInfo();
      Object device = map.get("device");
      pigeonResult.setDevice((String)device);
      Object brand = map.get("brand");
      pigeonResult.setBrand((String)brand);
      return pigeonResult;
    }
  }
  private static class HostDeviceInfoServiceCodec extends StandardMessageCodec {
    public static final HostDeviceInfoServiceCodec INSTANCE = new HostDeviceInfoServiceCodec();
    private HostDeviceInfoServiceCodec() {}
    @Override
    protected Object readValueOfType(byte type, @NonNull ByteBuffer buffer) {
      switch (type) {
        case (byte)128:         
          return DeviceInfo.fromMap((Map<String, Object>) readValue(buffer));
        
        default:        
          return super.readValueOfType(type, buffer);
        
      }
    }
    @Override
    protected void writeValue(@NonNull ByteArrayOutputStream stream, Object value)     {
      if (value instanceof DeviceInfo) {
        stream.write(128);
        writeValue(stream, ((DeviceInfo) value).toMap());
      } else 
{
        super.writeValue(stream, value);
      }
    }
  }

  /** Generated interface from Pigeon that represents a handler of messages from Flutter. */
  public interface HostDeviceInfoService {
    @NonNull DeviceInfo getDeviceInfo();

    /** The codec used by HostDeviceInfoService. */
    static MessageCodec<Object> getCodec() {
      return       HostDeviceInfoServiceCodec.INSTANCE;    }
    /**Sets up an instance of `HostDeviceInfoService` to handle messages through the `binaryMessenger`. */
    static void setup(BinaryMessenger binaryMessenger, HostDeviceInfoService api) {
      {
        BasicMessageChannel<Object> channel =
            new BasicMessageChannel<>(binaryMessenger, "dev.flutter.pigeon.HostDeviceInfoService.getDeviceInfo", getCodec());
        if (api != null) {
          channel.setMessageHandler((message, reply) -> {
            Map<String, Object> wrapped = new HashMap<>();
            try {
              DeviceInfo output = api.getDeviceInfo();
              wrapped.put("result", output);
            }
            catch (Error | RuntimeException exception) {
              wrapped.put("error", wrapError(exception));
            }
            reply.reply(wrapped);
          });
        } else {
          channel.setMessageHandler(null);
        }
      }
    }
  }
  @NonNull private static Map<String, Object> wrapError(@NonNull Throwable exception) {
    Map<String, Object> errorMap = new HashMap<>();
    errorMap.put("message", exception.toString());
    errorMap.put("code", exception.getClass().getSimpleName());
    errorMap.put("details", "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    return errorMap;
  }
}
