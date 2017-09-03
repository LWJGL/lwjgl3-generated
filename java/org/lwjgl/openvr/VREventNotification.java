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
 * Notification related events. Details will still change at this point.
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct VREvent_Notification_t {
 *     uint64_t ulUserValue;
 *     uint32_t notificationId;
 * }</pre></code>
 */
@NativeType("struct VREvent_Notification_t")
public class VREventNotification extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        ULUSERVALUE,
        NOTIFICATIONID;

    static {
        Layout layout = __struct(
            __member(8),
            __member(4)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        ULUSERVALUE = layout.offsetof(0);
        NOTIFICATIONID = layout.offsetof(1);
    }

    VREventNotification(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VREventNotification} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VREventNotification(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code ulUserValue} field. */
    @NativeType("uint64_t")
    public long ulUserValue() { return nulUserValue(address()); }
    /** Returns the value of the {@code notificationId} field. */
    @NativeType("uint32_t")
    public int notificationId() { return nnotificationId(address()); }

    /** Sets the specified value to the {@code ulUserValue} field. */
    public VREventNotification ulUserValue(@NativeType("uint64_t") long value) { nulUserValue(address(), value); return this; }
    /** Sets the specified value to the {@code notificationId} field. */
    public VREventNotification notificationId(@NativeType("uint32_t") int value) { nnotificationId(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VREventNotification set(
        long ulUserValue,
        int notificationId
    ) {
        ulUserValue(ulUserValue);
        notificationId(notificationId);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VREventNotification set(VREventNotification src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VREventNotification} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VREventNotification malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link VREventNotification} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VREventNotification calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link VREventNotification} instance allocated with {@link BufferUtils}. */
    public static VREventNotification create() {
        return new VREventNotification(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VREventNotification} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static VREventNotification create(long address) {
        return address == NULL ? null : new VREventNotification(address, null);
    }

    /**
     * Returns a new {@link VREventNotification.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventNotification.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventNotification.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VREventNotification.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VREventNotification} instance allocated on the thread-local {@link MemoryStack}. */
    public static VREventNotification mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VREventNotification} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VREventNotification callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VREventNotification} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VREventNotification mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VREventNotification} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VREventNotification callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VREventNotification.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VREventNotification.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VREventNotification.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VREventNotification.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #ulUserValue}. */
    public static long nulUserValue(long struct) { return memGetLong(struct + VREventNotification.ULUSERVALUE); }
    /** Unsafe version of {@link #notificationId}. */
    public static int nnotificationId(long struct) { return memGetInt(struct + VREventNotification.NOTIFICATIONID); }

    /** Unsafe version of {@link #ulUserValue(long) ulUserValue}. */
    public static void nulUserValue(long struct, long value) { memPutLong(struct + VREventNotification.ULUSERVALUE, value); }
    /** Unsafe version of {@link #notificationId(int) notificationId}. */
    public static void nnotificationId(long struct, int value) { memPutInt(struct + VREventNotification.NOTIFICATIONID, value); }

    // -----------------------------------

    /** An array of {@link VREventNotification} structs. */
    public static class Buffer extends StructBuffer<VREventNotification, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VREventNotification.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VREventNotification#SIZEOF}, and its mark will be undefined.
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
        protected VREventNotification newInstance(long address) {
            return new VREventNotification(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code ulUserValue} field. */
        @NativeType("uint64_t")
        public long ulUserValue() { return VREventNotification.nulUserValue(address()); }
        /** Returns the value of the {@code notificationId} field. */
        @NativeType("uint32_t")
        public int notificationId() { return VREventNotification.nnotificationId(address()); }

        /** Sets the specified value to the {@code ulUserValue} field. */
        public VREventNotification.Buffer ulUserValue(@NativeType("uint64_t") long value) { VREventNotification.nulUserValue(address(), value); return this; }
        /** Sets the specified value to the {@code notificationId} field. */
        public VREventNotification.Buffer notificationId(@NativeType("uint32_t") int value) { VREventNotification.nnotificationId(address(), value); return this; }

    }

}