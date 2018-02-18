/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Tracking state at a given absolute time (describes predicted HMD pose etc). Returned by {@link OVR#ovr_GetTrackingState GetTrackingState}.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code HeadPose} &ndash; 
 * Predicted head pose (and derivatives) at the requested absolute time. The look-ahead interval is equal to
 * {@code (HeadPose.TimeInSeconds - RawSensorData.TimeInSeconds)}.</li>
 * <li>{@code StatusFlags} &ndash; {@code HeadPose} tracking status described by {@code ovrStatusBits}.</li>
 * <li>{@code HandPoses} &ndash; 
 * The most recent calculated pose for each hand when hand controller tracking is present. {@code HandPoses[ovrHand_Left]} refers to the left hand and
 * {@code HandPoses[ovrHand_Right]} to the right hand. These values can be combined with {@code ovrInputState} for complete hand controller information.</li>
 * <li>{@code HandStatusFlags} &ndash; {@code HandPoses} status flags described by {@code ovrStatusBits}. Only {@link OVR#ovrStatus_OrientationTracked Status_OrientationTracked} and {@link OVR#ovrStatus_PositionTracked Status_PositionTracked} are reported.</li>
 * <li>{@code CalibratedOrigin} &ndash; 
 * the pose of the origin captured during calibration.
 * 
 * <p>Like all other poses here, this is expressed in the space set by {@link OVR#ovr_RecenterTrackingOrigin RecenterTrackingOrigin}, or {@link OVR#ovr_SpecifyTrackingOrigin SpecifyTrackingOrigin} and so will change every time
 * either of those functions are called. This pose can be used to calculate where the calibrated origin lands in the new recentered space. If an
 * application never calls {@link OVR#ovr_RecenterTrackingOrigin RecenterTrackingOrigin} or {@link OVR#ovr_SpecifyTrackingOrigin SpecifyTrackingOrigin}, expect this value to be the identity pose and as such will point
 * respective origin based on {@code ovrTrackingOrigin} requested when calling {@link OVR#ovr_GetTrackingState GetTrackingState}.</p></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct ovrTrackingState {
 *     {@link OVRPoseStatef ovrPoseStatef} HeadPose;
 *     unsigned int StatusFlags;
 *     {@link OVRPoseStatef ovrPoseStatef} HandPoses[2];
 *     unsigned int HandStatusFlags[2];
 *     {@link OVRPosef ovrPosef} CalibratedOrigin;
 * }</pre></code>
 */
@NativeType("struct ovrTrackingState")
public class OVRTrackingState extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        HEADPOSE,
        STATUSFLAGS,
        HANDPOSES,
        HANDSTATUSFLAGS,
        CALIBRATEDORIGIN;

    static {
        Layout layout = __struct(
            __member(OVRPoseStatef.SIZEOF, OVRPoseStatef.ALIGNOF),
            __member(4),
            __array(OVRPoseStatef.SIZEOF, OVRPoseStatef.ALIGNOF, 2),
            __array(4, 2),
            __member(OVRPosef.SIZEOF, OVRPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        HEADPOSE = layout.offsetof(0);
        STATUSFLAGS = layout.offsetof(1);
        HANDPOSES = layout.offsetof(2);
        HANDSTATUSFLAGS = layout.offsetof(3);
        CALIBRATEDORIGIN = layout.offsetof(4);
    }

    OVRTrackingState(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link OVRTrackingState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRTrackingState(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link OVRPoseStatef} view of the {@code HeadPose} field. */
    @NativeType("ovrPoseStatef")
    public OVRPoseStatef HeadPose() { return nHeadPose(address()); }
    /** Returns the value of the {@code StatusFlags} field. */
    @NativeType("unsigned int")
    public int StatusFlags() { return nStatusFlags(address()); }
    /** Returns a {@link OVRPoseStatef}.Buffer view of the {@code HandPoses} field. */
    @NativeType("ovrPoseStatef[2]")
    public OVRPoseStatef.Buffer HandPoses() { return nHandPoses(address()); }
    /** Returns a {@link OVRPoseStatef} view of the struct at the specified index of the {@code HandPoses} field. */
    @NativeType("ovrPoseStatef")
    public OVRPoseStatef HandPoses(int index) { return nHandPoses(address(), index); }
    /** Returns a {@link IntBuffer} view of the {@code HandStatusFlags} field. */
    @NativeType("unsigned int[2]")
    public IntBuffer HandStatusFlags() { return nHandStatusFlags(address()); }
    /** Returns the value at the specified index of the {@code HandStatusFlags} field. */
    @NativeType("unsigned int")
    public int HandStatusFlags(int index) { return nHandStatusFlags(address(), index); }
    /** Returns a {@link OVRPosef} view of the {@code CalibratedOrigin} field. */
    @NativeType("ovrPosef")
    public OVRPosef CalibratedOrigin() { return nCalibratedOrigin(address()); }

    // -----------------------------------

    /** Returns a new {@link OVRTrackingState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRTrackingState malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link OVRTrackingState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRTrackingState calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link OVRTrackingState} instance allocated with {@link BufferUtils}. */
    public static OVRTrackingState create() {
        return new OVRTrackingState(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link OVRTrackingState} instance for the specified memory address. */
    public static OVRTrackingState create(long address) {
        return new OVRTrackingState(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRTrackingState createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link OVRTrackingState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTrackingState.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRTrackingState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTrackingState.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRTrackingState.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTrackingState.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link OVRTrackingState.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static OVRTrackingState.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static OVRTrackingState.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link OVRTrackingState} instance allocated on the thread-local {@link MemoryStack}. */
    public static OVRTrackingState mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link OVRTrackingState} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static OVRTrackingState callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link OVRTrackingState} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRTrackingState mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link OVRTrackingState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRTrackingState callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRTrackingState.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTrackingState.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRTrackingState.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static OVRTrackingState.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRTrackingState.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRTrackingState.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRTrackingState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static OVRTrackingState.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #HeadPose}. */
    public static OVRPoseStatef nHeadPose(long struct) { return OVRPoseStatef.create(struct + OVRTrackingState.HEADPOSE); }
    /** Unsafe version of {@link #StatusFlags}. */
    public static int nStatusFlags(long struct) { return memGetInt(struct + OVRTrackingState.STATUSFLAGS); }
    /** Unsafe version of {@link #HandPoses}. */
    public static OVRPoseStatef.Buffer nHandPoses(long struct) { return OVRPoseStatef.create(struct + OVRTrackingState.HANDPOSES, 2); }
    /** Unsafe version of {@link #HandPoses(int) HandPoses}. */
    public static OVRPoseStatef nHandPoses(long struct, int index) {
        return OVRPoseStatef.create(struct + OVRTrackingState.HANDPOSES + check(index, 2) * OVRPoseStatef.SIZEOF);
    }
    /** Unsafe version of {@link #HandStatusFlags}. */
    public static IntBuffer nHandStatusFlags(long struct) { return memIntBuffer(struct + OVRTrackingState.HANDSTATUSFLAGS, 2); }
    /** Unsafe version of {@link #HandStatusFlags(int) HandStatusFlags}. */
    public static int nHandStatusFlags(long struct, int index) {
        return memGetInt(struct + OVRTrackingState.HANDSTATUSFLAGS + check(index, 2) * 4);
    }
    /** Unsafe version of {@link #CalibratedOrigin}. */
    public static OVRPosef nCalibratedOrigin(long struct) { return OVRPosef.create(struct + OVRTrackingState.CALIBRATEDORIGIN); }

    // -----------------------------------

    /** An array of {@link OVRTrackingState} structs. */
    public static class Buffer extends StructBuffer<OVRTrackingState, Buffer> implements NativeResource {

        /**
         * Creates a new {@link OVRTrackingState.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRTrackingState#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected OVRTrackingState newInstance(long address) {
            return new OVRTrackingState(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link OVRPoseStatef} view of the {@code HeadPose} field. */
        @NativeType("ovrPoseStatef")
        public OVRPoseStatef HeadPose() { return OVRTrackingState.nHeadPose(address()); }
        /** Returns the value of the {@code StatusFlags} field. */
        @NativeType("unsigned int")
        public int StatusFlags() { return OVRTrackingState.nStatusFlags(address()); }
        /** Returns a {@link OVRPoseStatef}.Buffer view of the {@code HandPoses} field. */
        @NativeType("ovrPoseStatef[2]")
        public OVRPoseStatef.Buffer HandPoses() { return OVRTrackingState.nHandPoses(address()); }
        /** Returns a {@link OVRPoseStatef} view of the struct at the specified index of the {@code HandPoses} field. */
        @NativeType("ovrPoseStatef")
        public OVRPoseStatef HandPoses(int index) { return OVRTrackingState.nHandPoses(address(), index); }
        /** Returns a {@link IntBuffer} view of the {@code HandStatusFlags} field. */
        @NativeType("unsigned int[2]")
        public IntBuffer HandStatusFlags() { return OVRTrackingState.nHandStatusFlags(address()); }
        /** Returns the value at the specified index of the {@code HandStatusFlags} field. */
        @NativeType("unsigned int")
        public int HandStatusFlags(int index) { return OVRTrackingState.nHandStatusFlags(address(), index); }
        /** Returns a {@link OVRPosef} view of the {@code CalibratedOrigin} field. */
        @NativeType("ovrPosef")
        public OVRPosef CalibratedOrigin() { return OVRTrackingState.nCalibratedOrigin(address()); }

    }

}