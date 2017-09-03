/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * union VREvent_Data_t {
 *     {@link VREventReserved VREvent_Reserved_t} reserved;
 *     {@link VREventController VREvent_Controller_t} controller;
 *     {@link VREventMouse VREvent_Mouse_t} mouse;
 *     {@link VREventScroll VREvent_Scroll_t} scroll;
 *     {@link VREventProcess VREvent_Process_t} process;
 *     {@link VREventNotification VREvent_Notification_t} notification;
 *     {@link VREventOverlay VREvent_Overlay_t} overlay;
 *     {@link VREventStatus VREvent_Status_t} status;
 *     {@link VREventKeyboard VREvent_Keyboard_t} keyboard;
 *     {@link VREventIpd VREvent_Ipd_t} ipd;
 *     {@link VREventChaperone VREvent_Chaperone_t} chaperone;
 *     {@link VREventPerformanceTest VREvent_PerformanceTest_t} performanceTest;
 *     {@link VREventTouchPadMove VREvent_TouchPadMove_t} touchPadMove;
 *     {@link VREventSeatedZeroPoseReset VREvent_SeatedZeroPoseReset_t} seatedZeroPoseReset;
 *     {@link VREventScreenshot VREvent_Screenshot_t} screenshot;
 *     {@link VREventScreenshotProgress VREvent_ScreenshotProgress_t} screenshotProgress;
 *     {@link VREventApplicationLaunch VREvent_ApplicationLaunch_t} applicationLaunch;
 *     {@link VREventEditingCameraSurface VREvent_EditingCameraSurface_t} cameraSurface;
 *     {@link VREventMessageOverlay VREvent_MessageOverlay_t} messageOverlay;
 *     {@link VREventProperty VREvent_Property_t} property;
 * }</pre></code>
 */
@NativeType("union VREvent_Data_t")
public class VREventData extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        RESERVED,
        CONTROLLER,
        MOUSE,
        SCROLL,
        PROCESS,
        NOTIFICATION,
        OVERLAY,
        STATUS,
        KEYBOARD,
        IPD,
        CHAPERONE,
        PERFORMANCETEST,
        TOUCHPADMOVE,
        SEATEDZEROPOSERESET,
        SCREENSHOT,
        SCREENSHOTPROGRESS,
        APPLICATIONLAUNCH,
        CAMERASURFACE,
        MESSAGEOVERLAY,
        PROPERTY;

    static {
        Layout layout = __union(
            __member(VREventReserved.SIZEOF, VREventReserved.ALIGNOF),
            __member(VREventController.SIZEOF, VREventController.ALIGNOF),
            __member(VREventMouse.SIZEOF, VREventMouse.ALIGNOF),
            __member(VREventScroll.SIZEOF, VREventScroll.ALIGNOF),
            __member(VREventProcess.SIZEOF, VREventProcess.ALIGNOF),
            __member(VREventNotification.SIZEOF, VREventNotification.ALIGNOF),
            __member(VREventOverlay.SIZEOF, VREventOverlay.ALIGNOF),
            __member(VREventStatus.SIZEOF, VREventStatus.ALIGNOF),
            __member(VREventKeyboard.SIZEOF, VREventKeyboard.ALIGNOF),
            __member(VREventIpd.SIZEOF, VREventIpd.ALIGNOF),
            __member(VREventChaperone.SIZEOF, VREventChaperone.ALIGNOF),
            __member(VREventPerformanceTest.SIZEOF, VREventPerformanceTest.ALIGNOF),
            __member(VREventTouchPadMove.SIZEOF, VREventTouchPadMove.ALIGNOF),
            __member(VREventSeatedZeroPoseReset.SIZEOF, VREventSeatedZeroPoseReset.ALIGNOF),
            __member(VREventScreenshot.SIZEOF, VREventScreenshot.ALIGNOF),
            __member(VREventScreenshotProgress.SIZEOF, VREventScreenshotProgress.ALIGNOF),
            __member(VREventApplicationLaunch.SIZEOF, VREventApplicationLaunch.ALIGNOF),
            __member(VREventEditingCameraSurface.SIZEOF, VREventEditingCameraSurface.ALIGNOF),
            __member(VREventMessageOverlay.SIZEOF, VREventMessageOverlay.ALIGNOF),
            __member(VREventProperty.SIZEOF, VREventProperty.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        RESERVED = layout.offsetof(0);
        CONTROLLER = layout.offsetof(1);
        MOUSE = layout.offsetof(2);
        SCROLL = layout.offsetof(3);
        PROCESS = layout.offsetof(4);
        NOTIFICATION = layout.offsetof(5);
        OVERLAY = layout.offsetof(6);
        STATUS = layout.offsetof(7);
        KEYBOARD = layout.offsetof(8);
        IPD = layout.offsetof(9);
        CHAPERONE = layout.offsetof(10);
        PERFORMANCETEST = layout.offsetof(11);
        TOUCHPADMOVE = layout.offsetof(12);
        SEATEDZEROPOSERESET = layout.offsetof(13);
        SCREENSHOT = layout.offsetof(14);
        SCREENSHOTPROGRESS = layout.offsetof(15);
        APPLICATIONLAUNCH = layout.offsetof(16);
        CAMERASURFACE = layout.offsetof(17);
        MESSAGEOVERLAY = layout.offsetof(18);
        PROPERTY = layout.offsetof(19);
    }

    VREventData(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventData(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link VREventReserved} view of the {@code reserved} field. */
    @NativeType("VREvent_Reserved_t")
    public VREventReserved reserved() { return nreserved(address()); }
    /** Returns a {@link VREventController} view of the {@code controller} field. */
    @NativeType("VREvent_Controller_t")
    public VREventController controller() { return ncontroller(address()); }
    /** Returns a {@link VREventMouse} view of the {@code mouse} field. */
    @NativeType("VREvent_Mouse_t")
    public VREventMouse mouse() { return nmouse(address()); }
    /** Returns a {@link VREventScroll} view of the {@code scroll} field. */
    @NativeType("VREvent_Scroll_t")
    public VREventScroll scroll() { return nscroll(address()); }
    /** Returns a {@link VREventProcess} view of the {@code process} field. */
    @NativeType("VREvent_Process_t")
    public VREventProcess process() { return nprocess(address()); }
    /** Returns a {@link VREventNotification} view of the {@code notification} field. */
    @NativeType("VREvent_Notification_t")
    public VREventNotification notification() { return nnotification(address()); }
    /** Returns a {@link VREventOverlay} view of the {@code overlay} field. */
    @NativeType("VREvent_Overlay_t")
    public VREventOverlay overlay() { return noverlay(address()); }
    /** Returns a {@link VREventStatus} view of the {@code status} field. */
    @NativeType("VREvent_Status_t")
    public VREventStatus status() { return nstatus(address()); }
    /** Returns a {@link VREventKeyboard} view of the {@code keyboard} field. */
    @NativeType("VREvent_Keyboard_t")
    public VREventKeyboard keyboard() { return nkeyboard(address()); }
    /** Returns a {@link VREventIpd} view of the {@code ipd} field. */
    @NativeType("VREvent_Ipd_t")
    public VREventIpd ipd() { return nipd(address()); }
    /** Returns a {@link VREventChaperone} view of the {@code chaperone} field. */
    @NativeType("VREvent_Chaperone_t")
    public VREventChaperone chaperone() { return nchaperone(address()); }
    /** Returns a {@link VREventPerformanceTest} view of the {@code performanceTest} field. */
    @NativeType("VREvent_PerformanceTest_t")
    public VREventPerformanceTest performanceTest() { return nperformanceTest(address()); }
    /** Returns a {@link VREventTouchPadMove} view of the {@code touchPadMove} field. */
    @NativeType("VREvent_TouchPadMove_t")
    public VREventTouchPadMove touchPadMove() { return ntouchPadMove(address()); }
    /** Returns a {@link VREventSeatedZeroPoseReset} view of the {@code seatedZeroPoseReset} field. */
    @NativeType("VREvent_SeatedZeroPoseReset_t")
    public VREventSeatedZeroPoseReset seatedZeroPoseReset() { return nseatedZeroPoseReset(address()); }
    /** Returns a {@link VREventScreenshot} view of the {@code screenshot} field. */
    @NativeType("VREvent_Screenshot_t")
    public VREventScreenshot screenshot() { return nscreenshot(address()); }
    /** Returns a {@link VREventScreenshotProgress} view of the {@code screenshotProgress} field. */
    @NativeType("VREvent_ScreenshotProgress_t")
    public VREventScreenshotProgress screenshotProgress() { return nscreenshotProgress(address()); }
    /** Returns a {@link VREventApplicationLaunch} view of the {@code applicationLaunch} field. */
    @NativeType("VREvent_ApplicationLaunch_t")
    public VREventApplicationLaunch applicationLaunch() { return napplicationLaunch(address()); }
    /** Returns a {@link VREventEditingCameraSurface} view of the {@code cameraSurface} field. */
    @NativeType("VREvent_EditingCameraSurface_t")
    public VREventEditingCameraSurface cameraSurface() { return ncameraSurface(address()); }
    /** Returns a {@link VREventMessageOverlay} view of the {@code messageOverlay} field. */
    @NativeType("VREvent_MessageOverlay_t")
    public VREventMessageOverlay messageOverlay() { return nmessageOverlay(address()); }
    /** Returns a {@link VREventProperty} view of the {@code property} field. */
    @NativeType("VREvent_Property_t")
    public VREventProperty property() { return nproperty(address()); }

    /** Copies the specified {@link VREventReserved} to the {@code reserved} field. */
    public VREventData reserved(@NativeType("VREvent_Reserved_t") VREventReserved value) { nreserved(address(), value); return this; }
    /** Copies the specified {@link VREventController} to the {@code controller} field. */
    public VREventData controller(@NativeType("VREvent_Controller_t") VREventController value) { ncontroller(address(), value); return this; }
    /** Copies the specified {@link VREventMouse} to the {@code mouse} field. */
    public VREventData mouse(@NativeType("VREvent_Mouse_t") VREventMouse value) { nmouse(address(), value); return this; }
    /** Copies the specified {@link VREventScroll} to the {@code scroll} field. */
    public VREventData scroll(@NativeType("VREvent_Scroll_t") VREventScroll value) { nscroll(address(), value); return this; }
    /** Copies the specified {@link VREventProcess} to the {@code process} field. */
    public VREventData process(@NativeType("VREvent_Process_t") VREventProcess value) { nprocess(address(), value); return this; }
    /** Copies the specified {@link VREventNotification} to the {@code notification} field. */
    public VREventData notification(@NativeType("VREvent_Notification_t") VREventNotification value) { nnotification(address(), value); return this; }
    /** Copies the specified {@link VREventOverlay} to the {@code overlay} field. */
    public VREventData overlay(@NativeType("VREvent_Overlay_t") VREventOverlay value) { noverlay(address(), value); return this; }
    /** Copies the specified {@link VREventStatus} to the {@code status} field. */
    public VREventData status(@NativeType("VREvent_Status_t") VREventStatus value) { nstatus(address(), value); return this; }
    /** Copies the specified {@link VREventKeyboard} to the {@code keyboard} field. */
    public VREventData keyboard(@NativeType("VREvent_Keyboard_t") VREventKeyboard value) { nkeyboard(address(), value); return this; }
    /** Copies the specified {@link VREventIpd} to the {@code ipd} field. */
    public VREventData ipd(@NativeType("VREvent_Ipd_t") VREventIpd value) { nipd(address(), value); return this; }
    /** Copies the specified {@link VREventChaperone} to the {@code chaperone} field. */
    public VREventData chaperone(@NativeType("VREvent_Chaperone_t") VREventChaperone value) { nchaperone(address(), value); return this; }
    /** Copies the specified {@link VREventPerformanceTest} to the {@code performanceTest} field. */
    public VREventData performanceTest(@NativeType("VREvent_PerformanceTest_t") VREventPerformanceTest value) { nperformanceTest(address(), value); return this; }
    /** Copies the specified {@link VREventTouchPadMove} to the {@code touchPadMove} field. */
    public VREventData touchPadMove(@NativeType("VREvent_TouchPadMove_t") VREventTouchPadMove value) { ntouchPadMove(address(), value); return this; }
    /** Copies the specified {@link VREventSeatedZeroPoseReset} to the {@code seatedZeroPoseReset} field. */
    public VREventData seatedZeroPoseReset(@NativeType("VREvent_SeatedZeroPoseReset_t") VREventSeatedZeroPoseReset value) { nseatedZeroPoseReset(address(), value); return this; }
    /** Copies the specified {@link VREventScreenshot} to the {@code screenshot} field. */
    public VREventData screenshot(@NativeType("VREvent_Screenshot_t") VREventScreenshot value) { nscreenshot(address(), value); return this; }
    /** Copies the specified {@link VREventScreenshotProgress} to the {@code screenshotProgress} field. */
    public VREventData screenshotProgress(@NativeType("VREvent_ScreenshotProgress_t") VREventScreenshotProgress value) { nscreenshotProgress(address(), value); return this; }
    /** Copies the specified {@link VREventApplicationLaunch} to the {@code applicationLaunch} field. */
    public VREventData applicationLaunch(@NativeType("VREvent_ApplicationLaunch_t") VREventApplicationLaunch value) { napplicationLaunch(address(), value); return this; }
    /** Copies the specified {@link VREventEditingCameraSurface} to the {@code cameraSurface} field. */
    public VREventData cameraSurface(@NativeType("VREvent_EditingCameraSurface_t") VREventEditingCameraSurface value) { ncameraSurface(address(), value); return this; }
    /** Copies the specified {@link VREventMessageOverlay} to the {@code messageOverlay} field. */
    public VREventData messageOverlay(@NativeType("VREvent_MessageOverlay_t") VREventMessageOverlay value) { nmessageOverlay(address(), value); return this; }
    /** Copies the specified {@link VREventProperty} to the {@code property} field. */
    public VREventData property(@NativeType("VREvent_Property_t") VREventProperty value) { nproperty(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VREventData set(VREventData src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VREventData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VREventData malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VREventData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VREventData calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VREventData} instance allocated with {@link BufferUtils}. */
    public static VREventData create() {
        return new VREventData(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VREventData} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VREventData create(long address) {
        return address == NULL ? null : new VREventData(address, null);
    }

    /**
     * Returns a new {@link VREventData.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventData.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventData.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VREventData.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VREventData} instance allocated on the thread-local {@link MemoryStack}. */
    public static VREventData mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VREventData} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VREventData callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VREventData} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VREventData mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VREventData} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VREventData callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VREventData.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VREventData.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VREventData.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventData.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #reserved}. */
    public static VREventReserved nreserved(long struct) { return VREventReserved.create(struct + VREventData.RESERVED); }
    /** Unsafe version of {@link #controller}. */
    public static VREventController ncontroller(long struct) { return VREventController.create(struct + VREventData.CONTROLLER); }
    /** Unsafe version of {@link #mouse}. */
    public static VREventMouse nmouse(long struct) { return VREventMouse.create(struct + VREventData.MOUSE); }
    /** Unsafe version of {@link #scroll}. */
    public static VREventScroll nscroll(long struct) { return VREventScroll.create(struct + VREventData.SCROLL); }
    /** Unsafe version of {@link #process}. */
    public static VREventProcess nprocess(long struct) { return VREventProcess.create(struct + VREventData.PROCESS); }
    /** Unsafe version of {@link #notification}. */
    public static VREventNotification nnotification(long struct) { return VREventNotification.create(struct + VREventData.NOTIFICATION); }
    /** Unsafe version of {@link #overlay}. */
    public static VREventOverlay noverlay(long struct) { return VREventOverlay.create(struct + VREventData.OVERLAY); }
    /** Unsafe version of {@link #status}. */
    public static VREventStatus nstatus(long struct) { return VREventStatus.create(struct + VREventData.STATUS); }
    /** Unsafe version of {@link #keyboard}. */
    public static VREventKeyboard nkeyboard(long struct) { return VREventKeyboard.create(struct + VREventData.KEYBOARD); }
    /** Unsafe version of {@link #ipd}. */
    public static VREventIpd nipd(long struct) { return VREventIpd.create(struct + VREventData.IPD); }
    /** Unsafe version of {@link #chaperone}. */
    public static VREventChaperone nchaperone(long struct) { return VREventChaperone.create(struct + VREventData.CHAPERONE); }
    /** Unsafe version of {@link #performanceTest}. */
    public static VREventPerformanceTest nperformanceTest(long struct) { return VREventPerformanceTest.create(struct + VREventData.PERFORMANCETEST); }
    /** Unsafe version of {@link #touchPadMove}. */
    public static VREventTouchPadMove ntouchPadMove(long struct) { return VREventTouchPadMove.create(struct + VREventData.TOUCHPADMOVE); }
    /** Unsafe version of {@link #seatedZeroPoseReset}. */
    public static VREventSeatedZeroPoseReset nseatedZeroPoseReset(long struct) { return VREventSeatedZeroPoseReset.create(struct + VREventData.SEATEDZEROPOSERESET); }
    /** Unsafe version of {@link #screenshot}. */
    public static VREventScreenshot nscreenshot(long struct) { return VREventScreenshot.create(struct + VREventData.SCREENSHOT); }
    /** Unsafe version of {@link #screenshotProgress}. */
    public static VREventScreenshotProgress nscreenshotProgress(long struct) { return VREventScreenshotProgress.create(struct + VREventData.SCREENSHOTPROGRESS); }
    /** Unsafe version of {@link #applicationLaunch}. */
    public static VREventApplicationLaunch napplicationLaunch(long struct) { return VREventApplicationLaunch.create(struct + VREventData.APPLICATIONLAUNCH); }
    /** Unsafe version of {@link #cameraSurface}. */
    public static VREventEditingCameraSurface ncameraSurface(long struct) { return VREventEditingCameraSurface.create(struct + VREventData.CAMERASURFACE); }
    /** Unsafe version of {@link #messageOverlay}. */
    public static VREventMessageOverlay nmessageOverlay(long struct) { return VREventMessageOverlay.create(struct + VREventData.MESSAGEOVERLAY); }
    /** Unsafe version of {@link #property}. */
    public static VREventProperty nproperty(long struct) { return VREventProperty.create(struct + VREventData.PROPERTY); }

    /** Unsafe version of {@link #reserved(VREventReserved) reserved}. */
    public static void nreserved(long struct, VREventReserved value) { memCopy(value.address(), struct + VREventData.RESERVED, VREventReserved.SIZEOF); }
    /** Unsafe version of {@link #controller(VREventController) controller}. */
    public static void ncontroller(long struct, VREventController value) { memCopy(value.address(), struct + VREventData.CONTROLLER, VREventController.SIZEOF); }
    /** Unsafe version of {@link #mouse(VREventMouse) mouse}. */
    public static void nmouse(long struct, VREventMouse value) { memCopy(value.address(), struct + VREventData.MOUSE, VREventMouse.SIZEOF); }
    /** Unsafe version of {@link #scroll(VREventScroll) scroll}. */
    public static void nscroll(long struct, VREventScroll value) { memCopy(value.address(), struct + VREventData.SCROLL, VREventScroll.SIZEOF); }
    /** Unsafe version of {@link #process(VREventProcess) process}. */
    public static void nprocess(long struct, VREventProcess value) { memCopy(value.address(), struct + VREventData.PROCESS, VREventProcess.SIZEOF); }
    /** Unsafe version of {@link #notification(VREventNotification) notification}. */
    public static void nnotification(long struct, VREventNotification value) { memCopy(value.address(), struct + VREventData.NOTIFICATION, VREventNotification.SIZEOF); }
    /** Unsafe version of {@link #overlay(VREventOverlay) overlay}. */
    public static void noverlay(long struct, VREventOverlay value) { memCopy(value.address(), struct + VREventData.OVERLAY, VREventOverlay.SIZEOF); }
    /** Unsafe version of {@link #status(VREventStatus) status}. */
    public static void nstatus(long struct, VREventStatus value) { memCopy(value.address(), struct + VREventData.STATUS, VREventStatus.SIZEOF); }
    /** Unsafe version of {@link #keyboard(VREventKeyboard) keyboard}. */
    public static void nkeyboard(long struct, VREventKeyboard value) { memCopy(value.address(), struct + VREventData.KEYBOARD, VREventKeyboard.SIZEOF); }
    /** Unsafe version of {@link #ipd(VREventIpd) ipd}. */
    public static void nipd(long struct, VREventIpd value) { memCopy(value.address(), struct + VREventData.IPD, VREventIpd.SIZEOF); }
    /** Unsafe version of {@link #chaperone(VREventChaperone) chaperone}. */
    public static void nchaperone(long struct, VREventChaperone value) { memCopy(value.address(), struct + VREventData.CHAPERONE, VREventChaperone.SIZEOF); }
    /** Unsafe version of {@link #performanceTest(VREventPerformanceTest) performanceTest}. */
    public static void nperformanceTest(long struct, VREventPerformanceTest value) { memCopy(value.address(), struct + VREventData.PERFORMANCETEST, VREventPerformanceTest.SIZEOF); }
    /** Unsafe version of {@link #touchPadMove(VREventTouchPadMove) touchPadMove}. */
    public static void ntouchPadMove(long struct, VREventTouchPadMove value) { memCopy(value.address(), struct + VREventData.TOUCHPADMOVE, VREventTouchPadMove.SIZEOF); }
    /** Unsafe version of {@link #seatedZeroPoseReset(VREventSeatedZeroPoseReset) seatedZeroPoseReset}. */
    public static void nseatedZeroPoseReset(long struct, VREventSeatedZeroPoseReset value) { memCopy(value.address(), struct + VREventData.SEATEDZEROPOSERESET, VREventSeatedZeroPoseReset.SIZEOF); }
    /** Unsafe version of {@link #screenshot(VREventScreenshot) screenshot}. */
    public static void nscreenshot(long struct, VREventScreenshot value) { memCopy(value.address(), struct + VREventData.SCREENSHOT, VREventScreenshot.SIZEOF); }
    /** Unsafe version of {@link #screenshotProgress(VREventScreenshotProgress) screenshotProgress}. */
    public static void nscreenshotProgress(long struct, VREventScreenshotProgress value) { memCopy(value.address(), struct + VREventData.SCREENSHOTPROGRESS, VREventScreenshotProgress.SIZEOF); }
    /** Unsafe version of {@link #applicationLaunch(VREventApplicationLaunch) applicationLaunch}. */
    public static void napplicationLaunch(long struct, VREventApplicationLaunch value) { memCopy(value.address(), struct + VREventData.APPLICATIONLAUNCH, VREventApplicationLaunch.SIZEOF); }
    /** Unsafe version of {@link #cameraSurface(VREventEditingCameraSurface) cameraSurface}. */
    public static void ncameraSurface(long struct, VREventEditingCameraSurface value) { memCopy(value.address(), struct + VREventData.CAMERASURFACE, VREventEditingCameraSurface.SIZEOF); }
    /** Unsafe version of {@link #messageOverlay(VREventMessageOverlay) messageOverlay}. */
    public static void nmessageOverlay(long struct, VREventMessageOverlay value) { memCopy(value.address(), struct + VREventData.MESSAGEOVERLAY, VREventMessageOverlay.SIZEOF); }
    /** Unsafe version of {@link #property(VREventProperty) property}. */
    public static void nproperty(long struct, VREventProperty value) { memCopy(value.address(), struct + VREventData.PROPERTY, VREventProperty.SIZEOF); }

    // -----------------------------------

    /** An array of {@link VREventData} structs. */
    public static class Buffer extends StructBuffer<VREventData, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VREventData.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventData#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VREventData newInstance(long address) {
            return new VREventData(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link VREventReserved} view of the {@code reserved} field. */
        @NativeType("VREvent_Reserved_t")
        public VREventReserved reserved() { return VREventData.nreserved(address()); }
        /** Returns a {@link VREventController} view of the {@code controller} field. */
        @NativeType("VREvent_Controller_t")
        public VREventController controller() { return VREventData.ncontroller(address()); }
        /** Returns a {@link VREventMouse} view of the {@code mouse} field. */
        @NativeType("VREvent_Mouse_t")
        public VREventMouse mouse() { return VREventData.nmouse(address()); }
        /** Returns a {@link VREventScroll} view of the {@code scroll} field. */
        @NativeType("VREvent_Scroll_t")
        public VREventScroll scroll() { return VREventData.nscroll(address()); }
        /** Returns a {@link VREventProcess} view of the {@code process} field. */
        @NativeType("VREvent_Process_t")
        public VREventProcess process() { return VREventData.nprocess(address()); }
        /** Returns a {@link VREventNotification} view of the {@code notification} field. */
        @NativeType("VREvent_Notification_t")
        public VREventNotification notification() { return VREventData.nnotification(address()); }
        /** Returns a {@link VREventOverlay} view of the {@code overlay} field. */
        @NativeType("VREvent_Overlay_t")
        public VREventOverlay overlay() { return VREventData.noverlay(address()); }
        /** Returns a {@link VREventStatus} view of the {@code status} field. */
        @NativeType("VREvent_Status_t")
        public VREventStatus status() { return VREventData.nstatus(address()); }
        /** Returns a {@link VREventKeyboard} view of the {@code keyboard} field. */
        @NativeType("VREvent_Keyboard_t")
        public VREventKeyboard keyboard() { return VREventData.nkeyboard(address()); }
        /** Returns a {@link VREventIpd} view of the {@code ipd} field. */
        @NativeType("VREvent_Ipd_t")
        public VREventIpd ipd() { return VREventData.nipd(address()); }
        /** Returns a {@link VREventChaperone} view of the {@code chaperone} field. */
        @NativeType("VREvent_Chaperone_t")
        public VREventChaperone chaperone() { return VREventData.nchaperone(address()); }
        /** Returns a {@link VREventPerformanceTest} view of the {@code performanceTest} field. */
        @NativeType("VREvent_PerformanceTest_t")
        public VREventPerformanceTest performanceTest() { return VREventData.nperformanceTest(address()); }
        /** Returns a {@link VREventTouchPadMove} view of the {@code touchPadMove} field. */
        @NativeType("VREvent_TouchPadMove_t")
        public VREventTouchPadMove touchPadMove() { return VREventData.ntouchPadMove(address()); }
        /** Returns a {@link VREventSeatedZeroPoseReset} view of the {@code seatedZeroPoseReset} field. */
        @NativeType("VREvent_SeatedZeroPoseReset_t")
        public VREventSeatedZeroPoseReset seatedZeroPoseReset() { return VREventData.nseatedZeroPoseReset(address()); }
        /** Returns a {@link VREventScreenshot} view of the {@code screenshot} field. */
        @NativeType("VREvent_Screenshot_t")
        public VREventScreenshot screenshot() { return VREventData.nscreenshot(address()); }
        /** Returns a {@link VREventScreenshotProgress} view of the {@code screenshotProgress} field. */
        @NativeType("VREvent_ScreenshotProgress_t")
        public VREventScreenshotProgress screenshotProgress() { return VREventData.nscreenshotProgress(address()); }
        /** Returns a {@link VREventApplicationLaunch} view of the {@code applicationLaunch} field. */
        @NativeType("VREvent_ApplicationLaunch_t")
        public VREventApplicationLaunch applicationLaunch() { return VREventData.napplicationLaunch(address()); }
        /** Returns a {@link VREventEditingCameraSurface} view of the {@code cameraSurface} field. */
        @NativeType("VREvent_EditingCameraSurface_t")
        public VREventEditingCameraSurface cameraSurface() { return VREventData.ncameraSurface(address()); }
        /** Returns a {@link VREventMessageOverlay} view of the {@code messageOverlay} field. */
        @NativeType("VREvent_MessageOverlay_t")
        public VREventMessageOverlay messageOverlay() { return VREventData.nmessageOverlay(address()); }
        /** Returns a {@link VREventProperty} view of the {@code property} field. */
        @NativeType("VREvent_Property_t")
        public VREventProperty property() { return VREventData.nproperty(address()); }

        /** Copies the specified {@link VREventReserved} to the {@code reserved} field. */
        public VREventData.Buffer reserved(@NativeType("VREvent_Reserved_t") VREventReserved value) { VREventData.nreserved(address(), value); return this; }
        /** Copies the specified {@link VREventController} to the {@code controller} field. */
        public VREventData.Buffer controller(@NativeType("VREvent_Controller_t") VREventController value) { VREventData.ncontroller(address(), value); return this; }
        /** Copies the specified {@link VREventMouse} to the {@code mouse} field. */
        public VREventData.Buffer mouse(@NativeType("VREvent_Mouse_t") VREventMouse value) { VREventData.nmouse(address(), value); return this; }
        /** Copies the specified {@link VREventScroll} to the {@code scroll} field. */
        public VREventData.Buffer scroll(@NativeType("VREvent_Scroll_t") VREventScroll value) { VREventData.nscroll(address(), value); return this; }
        /** Copies the specified {@link VREventProcess} to the {@code process} field. */
        public VREventData.Buffer process(@NativeType("VREvent_Process_t") VREventProcess value) { VREventData.nprocess(address(), value); return this; }
        /** Copies the specified {@link VREventNotification} to the {@code notification} field. */
        public VREventData.Buffer notification(@NativeType("VREvent_Notification_t") VREventNotification value) { VREventData.nnotification(address(), value); return this; }
        /** Copies the specified {@link VREventOverlay} to the {@code overlay} field. */
        public VREventData.Buffer overlay(@NativeType("VREvent_Overlay_t") VREventOverlay value) { VREventData.noverlay(address(), value); return this; }
        /** Copies the specified {@link VREventStatus} to the {@code status} field. */
        public VREventData.Buffer status(@NativeType("VREvent_Status_t") VREventStatus value) { VREventData.nstatus(address(), value); return this; }
        /** Copies the specified {@link VREventKeyboard} to the {@code keyboard} field. */
        public VREventData.Buffer keyboard(@NativeType("VREvent_Keyboard_t") VREventKeyboard value) { VREventData.nkeyboard(address(), value); return this; }
        /** Copies the specified {@link VREventIpd} to the {@code ipd} field. */
        public VREventData.Buffer ipd(@NativeType("VREvent_Ipd_t") VREventIpd value) { VREventData.nipd(address(), value); return this; }
        /** Copies the specified {@link VREventChaperone} to the {@code chaperone} field. */
        public VREventData.Buffer chaperone(@NativeType("VREvent_Chaperone_t") VREventChaperone value) { VREventData.nchaperone(address(), value); return this; }
        /** Copies the specified {@link VREventPerformanceTest} to the {@code performanceTest} field. */
        public VREventData.Buffer performanceTest(@NativeType("VREvent_PerformanceTest_t") VREventPerformanceTest value) { VREventData.nperformanceTest(address(), value); return this; }
        /** Copies the specified {@link VREventTouchPadMove} to the {@code touchPadMove} field. */
        public VREventData.Buffer touchPadMove(@NativeType("VREvent_TouchPadMove_t") VREventTouchPadMove value) { VREventData.ntouchPadMove(address(), value); return this; }
        /** Copies the specified {@link VREventSeatedZeroPoseReset} to the {@code seatedZeroPoseReset} field. */
        public VREventData.Buffer seatedZeroPoseReset(@NativeType("VREvent_SeatedZeroPoseReset_t") VREventSeatedZeroPoseReset value) { VREventData.nseatedZeroPoseReset(address(), value); return this; }
        /** Copies the specified {@link VREventScreenshot} to the {@code screenshot} field. */
        public VREventData.Buffer screenshot(@NativeType("VREvent_Screenshot_t") VREventScreenshot value) { VREventData.nscreenshot(address(), value); return this; }
        /** Copies the specified {@link VREventScreenshotProgress} to the {@code screenshotProgress} field. */
        public VREventData.Buffer screenshotProgress(@NativeType("VREvent_ScreenshotProgress_t") VREventScreenshotProgress value) { VREventData.nscreenshotProgress(address(), value); return this; }
        /** Copies the specified {@link VREventApplicationLaunch} to the {@code applicationLaunch} field. */
        public VREventData.Buffer applicationLaunch(@NativeType("VREvent_ApplicationLaunch_t") VREventApplicationLaunch value) { VREventData.napplicationLaunch(address(), value); return this; }
        /** Copies the specified {@link VREventEditingCameraSurface} to the {@code cameraSurface} field. */
        public VREventData.Buffer cameraSurface(@NativeType("VREvent_EditingCameraSurface_t") VREventEditingCameraSurface value) { VREventData.ncameraSurface(address(), value); return this; }
        /** Copies the specified {@link VREventMessageOverlay} to the {@code messageOverlay} field. */
        public VREventData.Buffer messageOverlay(@NativeType("VREvent_MessageOverlay_t") VREventMessageOverlay value) { VREventData.nmessageOverlay(address(), value); return this; }
        /** Copies the specified {@link VREventProperty} to the {@code property} field. */
        public VREventData.Buffer property(@NativeType("VREvent_Property_t") VREventProperty value) { VREventData.nproperty(address(), value); return this; }

    }

}