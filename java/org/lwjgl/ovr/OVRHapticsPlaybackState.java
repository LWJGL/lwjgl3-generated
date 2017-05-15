/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * State of the Haptics playback for Touch vibration.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code RemainingQueueSpace} &ndash; Remaining space available to queue more samples</li>
 * <li>{@code SamplesQueued} &ndash; Number of samples currently queued</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct ovrHapticsPlaybackState {
 *     int RemainingQueueSpace;
 *     int SamplesQueued;
 * }</pre></code>
 */
public class OVRHapticsPlaybackState extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        REMAININGQUEUESPACE,
        SAMPLESQUEUED;

    static {
        Layout layout = __struct(
            __member(4),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        REMAININGQUEUESPACE = layout.offsetof(0);
        SAMPLESQUEUED = layout.offsetof(1);
    }

    OVRHapticsPlaybackState(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link OVRHapticsPlaybackState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public OVRHapticsPlaybackState(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code RemainingQueueSpace} field. */
    public int RemainingQueueSpace() { return nRemainingQueueSpace(address()); }
    /** Returns the value of the {@code SamplesQueued} field. */
    public int SamplesQueued() { return nSamplesQueued(address()); }

    // -----------------------------------

    /** Returns a new {@link OVRHapticsPlaybackState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static OVRHapticsPlaybackState malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link OVRHapticsPlaybackState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static OVRHapticsPlaybackState calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link OVRHapticsPlaybackState} instance allocated with {@link BufferUtils}. */
    public static OVRHapticsPlaybackState create() {
        return new OVRHapticsPlaybackState(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link OVRHapticsPlaybackState} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static OVRHapticsPlaybackState create(long address) {
        return address == NULL ? null : new OVRHapticsPlaybackState(address, null);
    }

    /**
     * Returns a new {@link OVRHapticsPlaybackState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRHapticsPlaybackState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRHapticsPlaybackState.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link OVRHapticsPlaybackState.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link OVRHapticsPlaybackState} instance allocated on the thread-local {@link MemoryStack}. */
    public static OVRHapticsPlaybackState mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link OVRHapticsPlaybackState} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static OVRHapticsPlaybackState callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link OVRHapticsPlaybackState} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRHapticsPlaybackState mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link OVRHapticsPlaybackState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static OVRHapticsPlaybackState callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link OVRHapticsPlaybackState.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRHapticsPlaybackState.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link OVRHapticsPlaybackState.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link OVRHapticsPlaybackState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #RemainingQueueSpace}. */
    public static int nRemainingQueueSpace(long struct) { return memGetInt(struct + OVRHapticsPlaybackState.REMAININGQUEUESPACE); }
    /** Unsafe version of {@link #SamplesQueued}. */
    public static int nSamplesQueued(long struct) { return memGetInt(struct + OVRHapticsPlaybackState.SAMPLESQUEUED); }

    // -----------------------------------

    /** An array of {@link OVRHapticsPlaybackState} structs. */
    public static class Buffer extends StructBuffer<OVRHapticsPlaybackState, Buffer> implements NativeResource {

        /**
         * Creates a new {@link OVRHapticsPlaybackState.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link OVRHapticsPlaybackState#SIZEOF}, and its mark will be undefined.
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
        protected OVRHapticsPlaybackState newInstance(long address) {
            return new OVRHapticsPlaybackState(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code RemainingQueueSpace} field. */
        public int RemainingQueueSpace() { return OVRHapticsPlaybackState.nRemainingQueueSpace(address()); }
        /** Returns the value of the {@code SamplesQueued} field. */
        public int SamplesQueued() { return OVRHapticsPlaybackState.nSamplesQueued(address()); }

    }

}