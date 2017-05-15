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
 * Describes a single pose for a tracked object.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code vVelocity} &ndash; velocity in tracker space in m/s</li>
 * <li>{@code vAngularVelocity} &ndash; angular velocity in radians/s</li>
 * <li>{@code bDeviceIsConnected} &ndash; This indicates that there is a device connected for this spot in the pose array. It could go from true to false if the user unplugs the device.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct TrackedDevicePose_t {
 *     {@link HmdMatrix34 HmdMatrix34_t} mDeviceToAbsoluteTracking;
 *     {@link HmdVector3 HmdVector3_t} vVelocity;
 *     {@link HmdVector3 HmdVector3_t} vAngularVelocity;
 *     ETrackingResult eTrackingResult;
 *     bool bPoseIsValid;
 *     bool bDeviceIsConnected;
 * }</pre></code>
 */
public class TrackedDevicePose extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        MDEVICETOABSOLUTETRACKING,
        VVELOCITY,
        VANGULARVELOCITY,
        ETRACKINGRESULT,
        BPOSEISVALID,
        BDEVICEISCONNECTED;

    static {
        Layout layout = __struct(
            __member(HmdMatrix34.SIZEOF, HmdMatrix34.ALIGNOF),
            __member(HmdVector3.SIZEOF, HmdVector3.ALIGNOF),
            __member(HmdVector3.SIZEOF, HmdVector3.ALIGNOF),
            __member(4),
            __member(1),
            __member(1)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        MDEVICETOABSOLUTETRACKING = layout.offsetof(0);
        VVELOCITY = layout.offsetof(1);
        VANGULARVELOCITY = layout.offsetof(2);
        ETRACKINGRESULT = layout.offsetof(3);
        BPOSEISVALID = layout.offsetof(4);
        BDEVICEISCONNECTED = layout.offsetof(5);
    }

    TrackedDevicePose(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link TrackedDevicePose} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public TrackedDevicePose(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link HmdMatrix34} view of the {@code mDeviceToAbsoluteTracking} field. */
    public HmdMatrix34 mDeviceToAbsoluteTracking() { return nmDeviceToAbsoluteTracking(address()); }
    /** Returns a {@link HmdVector3} view of the {@code vVelocity} field. */
    public HmdVector3 vVelocity() { return nvVelocity(address()); }
    /** Returns a {@link HmdVector3} view of the {@code vAngularVelocity} field. */
    public HmdVector3 vAngularVelocity() { return nvAngularVelocity(address()); }
    /** Returns the value of the {@code eTrackingResult} field. */
    public int eTrackingResult() { return neTrackingResult(address()); }
    /** Returns the value of the {@code bPoseIsValid} field. */
    public boolean bPoseIsValid() { return nbPoseIsValid(address()); }
    /** Returns the value of the {@code bDeviceIsConnected} field. */
    public boolean bDeviceIsConnected() { return nbDeviceIsConnected(address()); }

    /** Copies the specified {@link HmdMatrix34} to the {@code mDeviceToAbsoluteTracking} field. */
    public TrackedDevicePose mDeviceToAbsoluteTracking(HmdMatrix34 value) { nmDeviceToAbsoluteTracking(address(), value); return this; }
    /** Copies the specified {@link HmdVector3} to the {@code vVelocity} field. */
    public TrackedDevicePose vVelocity(HmdVector3 value) { nvVelocity(address(), value); return this; }
    /** Copies the specified {@link HmdVector3} to the {@code vAngularVelocity} field. */
    public TrackedDevicePose vAngularVelocity(HmdVector3 value) { nvAngularVelocity(address(), value); return this; }
    /** Sets the specified value to the {@code eTrackingResult} field. */
    public TrackedDevicePose eTrackingResult(int value) { neTrackingResult(address(), value); return this; }
    /** Sets the specified value to the {@code bPoseIsValid} field. */
    public TrackedDevicePose bPoseIsValid(boolean value) { nbPoseIsValid(address(), value); return this; }
    /** Sets the specified value to the {@code bDeviceIsConnected} field. */
    public TrackedDevicePose bDeviceIsConnected(boolean value) { nbDeviceIsConnected(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public TrackedDevicePose set(
        HmdMatrix34 mDeviceToAbsoluteTracking,
        HmdVector3 vVelocity,
        HmdVector3 vAngularVelocity,
        int eTrackingResult,
        boolean bPoseIsValid,
        boolean bDeviceIsConnected
    ) {
        mDeviceToAbsoluteTracking(mDeviceToAbsoluteTracking);
        vVelocity(vVelocity);
        vAngularVelocity(vAngularVelocity);
        eTrackingResult(eTrackingResult);
        bPoseIsValid(bPoseIsValid);
        bDeviceIsConnected(bDeviceIsConnected);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public TrackedDevicePose set(TrackedDevicePose src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link TrackedDevicePose} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static TrackedDevicePose malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link TrackedDevicePose} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static TrackedDevicePose calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link TrackedDevicePose} instance allocated with {@link BufferUtils}. */
    public static TrackedDevicePose create() {
        return new TrackedDevicePose(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link TrackedDevicePose} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static TrackedDevicePose create(long address) {
        return address == NULL ? null : new TrackedDevicePose(address, null);
    }

    /**
     * Returns a new {@link TrackedDevicePose.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link TrackedDevicePose.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link TrackedDevicePose.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link TrackedDevicePose.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link TrackedDevicePose} instance allocated on the thread-local {@link MemoryStack}. */
    public static TrackedDevicePose mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link TrackedDevicePose} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static TrackedDevicePose callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link TrackedDevicePose} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static TrackedDevicePose mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link TrackedDevicePose} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static TrackedDevicePose callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link TrackedDevicePose.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link TrackedDevicePose.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link TrackedDevicePose.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link TrackedDevicePose.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #mDeviceToAbsoluteTracking}. */
    public static HmdMatrix34 nmDeviceToAbsoluteTracking(long struct) { return HmdMatrix34.create(struct + TrackedDevicePose.MDEVICETOABSOLUTETRACKING); }
    /** Unsafe version of {@link #vVelocity}. */
    public static HmdVector3 nvVelocity(long struct) { return HmdVector3.create(struct + TrackedDevicePose.VVELOCITY); }
    /** Unsafe version of {@link #vAngularVelocity}. */
    public static HmdVector3 nvAngularVelocity(long struct) { return HmdVector3.create(struct + TrackedDevicePose.VANGULARVELOCITY); }
    /** Unsafe version of {@link #eTrackingResult}. */
    public static int neTrackingResult(long struct) { return memGetInt(struct + TrackedDevicePose.ETRACKINGRESULT); }
    /** Unsafe version of {@link #bPoseIsValid}. */
    public static boolean nbPoseIsValid(long struct) { return memGetByte(struct + TrackedDevicePose.BPOSEISVALID) != 0; }
    /** Unsafe version of {@link #bDeviceIsConnected}. */
    public static boolean nbDeviceIsConnected(long struct) { return memGetByte(struct + TrackedDevicePose.BDEVICEISCONNECTED) != 0; }

    /** Unsafe version of {@link #mDeviceToAbsoluteTracking(HmdMatrix34) mDeviceToAbsoluteTracking}. */
    public static void nmDeviceToAbsoluteTracking(long struct, HmdMatrix34 value) { memCopy(value.address(), struct + TrackedDevicePose.MDEVICETOABSOLUTETRACKING, HmdMatrix34.SIZEOF); }
    /** Unsafe version of {@link #vVelocity(HmdVector3) vVelocity}. */
    public static void nvVelocity(long struct, HmdVector3 value) { memCopy(value.address(), struct + TrackedDevicePose.VVELOCITY, HmdVector3.SIZEOF); }
    /** Unsafe version of {@link #vAngularVelocity(HmdVector3) vAngularVelocity}. */
    public static void nvAngularVelocity(long struct, HmdVector3 value) { memCopy(value.address(), struct + TrackedDevicePose.VANGULARVELOCITY, HmdVector3.SIZEOF); }
    /** Unsafe version of {@link #eTrackingResult(int) eTrackingResult}. */
    public static void neTrackingResult(long struct, int value) { memPutInt(struct + TrackedDevicePose.ETRACKINGRESULT, value); }
    /** Unsafe version of {@link #bPoseIsValid(boolean) bPoseIsValid}. */
    public static void nbPoseIsValid(long struct, boolean value) { memPutByte(struct + TrackedDevicePose.BPOSEISVALID, value ? (byte)1 : (byte)0); }
    /** Unsafe version of {@link #bDeviceIsConnected(boolean) bDeviceIsConnected}. */
    public static void nbDeviceIsConnected(long struct, boolean value) { memPutByte(struct + TrackedDevicePose.BDEVICEISCONNECTED, value ? (byte)1 : (byte)0); }

    // -----------------------------------

    /** An array of {@link TrackedDevicePose} structs. */
    public static class Buffer extends StructBuffer<TrackedDevicePose, Buffer> implements NativeResource {

        /**
         * Creates a new {@link TrackedDevicePose.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link TrackedDevicePose#SIZEOF}, and its mark will be undefined.
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
        protected TrackedDevicePose newInstance(long address) {
            return new TrackedDevicePose(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link HmdMatrix34} view of the {@code mDeviceToAbsoluteTracking} field. */
        public HmdMatrix34 mDeviceToAbsoluteTracking() { return TrackedDevicePose.nmDeviceToAbsoluteTracking(address()); }
        /** Returns a {@link HmdVector3} view of the {@code vVelocity} field. */
        public HmdVector3 vVelocity() { return TrackedDevicePose.nvVelocity(address()); }
        /** Returns a {@link HmdVector3} view of the {@code vAngularVelocity} field. */
        public HmdVector3 vAngularVelocity() { return TrackedDevicePose.nvAngularVelocity(address()); }
        /** Returns the value of the {@code eTrackingResult} field. */
        public int eTrackingResult() { return TrackedDevicePose.neTrackingResult(address()); }
        /** Returns the value of the {@code bPoseIsValid} field. */
        public boolean bPoseIsValid() { return TrackedDevicePose.nbPoseIsValid(address()); }
        /** Returns the value of the {@code bDeviceIsConnected} field. */
        public boolean bDeviceIsConnected() { return TrackedDevicePose.nbDeviceIsConnected(address()); }

        /** Copies the specified {@link HmdMatrix34} to the {@code mDeviceToAbsoluteTracking} field. */
        public TrackedDevicePose.Buffer mDeviceToAbsoluteTracking(HmdMatrix34 value) { TrackedDevicePose.nmDeviceToAbsoluteTracking(address(), value); return this; }
        /** Copies the specified {@link HmdVector3} to the {@code vVelocity} field. */
        public TrackedDevicePose.Buffer vVelocity(HmdVector3 value) { TrackedDevicePose.nvVelocity(address(), value); return this; }
        /** Copies the specified {@link HmdVector3} to the {@code vAngularVelocity} field. */
        public TrackedDevicePose.Buffer vAngularVelocity(HmdVector3 value) { TrackedDevicePose.nvAngularVelocity(address(), value); return this; }
        /** Sets the specified value to the {@code eTrackingResult} field. */
        public TrackedDevicePose.Buffer eTrackingResult(int value) { TrackedDevicePose.neTrackingResult(address(), value); return this; }
        /** Sets the specified value to the {@code bPoseIsValid} field. */
        public TrackedDevicePose.Buffer bPoseIsValid(boolean value) { TrackedDevicePose.nbPoseIsValid(address(), value); return this; }
        /** Sets the specified value to the {@code bDeviceIsConnected} field. */
        public TrackedDevicePose.Buffer bDeviceIsConnected(boolean value) { TrackedDevicePose.nbDeviceIsConnected(address(), value); return this; }

    }

}