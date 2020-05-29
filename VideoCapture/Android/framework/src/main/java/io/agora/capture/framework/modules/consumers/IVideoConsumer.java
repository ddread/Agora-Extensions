package io.agora.capture.framework.modules.consumers;

import io.agora.capture.framework.modules.channels.VideoChannel;
import io.agora.capture.video.camera.VideoCaptureFrame;

public interface IVideoConsumer {
    int TYPE_ON_SCREEN = 0;
    int TYPE_OFF_SCREEN = 1;

    void onConsumeFrame(VideoCaptureFrame frame, VideoChannel.ChannelContext context);
    void connectChannel(int channelId);
    void disconnectChannel(int channelId);

    void setMirror(boolean isMirrored);

    /**
     * Give a chance for subclasses to return a drawing target
     * object. This object can only be either a Surface or a
     * SurfaceTexture.
     * @return
     */
    Object onGetDrawingTarget();

    int onMeasuredWidth();
    int onMeasuredHeight();
}
