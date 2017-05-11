/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.windows;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Receives information about the display device specified by the {@code iDevNum} parameter of the {@link User32#EnumDisplayDevices} function.
 * 
 * <p>The four string members are set based on the parameters passed to {@code EnumDisplayDevices}. If the {@code lpDevice} param is {@code NULL}, then
 * {@code DISPLAY_DEVICE} is filled in with information about the display adapter(s). If it is a valid device name, then it is filled in with information
 * about the monitor(s) for that device.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code cb} &ndash; size, in bytes, of the {@code DISPLAY_DEVICE} structure. This must be initialized prior to calling {@link User32#EnumDisplayDevices}.</li>
 * <li>{@code DeviceName} &ndash; an array of characters identifying the device name. This is either the adapter device or the monitor device.</li>
 * <li>{@code DeviceString} &ndash; an array of characters containing the device context string. This is either a description of the display adapter or of the display monitor.</li>
 * <li>{@code StateFlags} &ndash; device state flags</li>
 * <li>{@code DeviceID} &ndash; not used</li>
 * <li>{@code DeviceKey} &ndash; reserved</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct DISPLAY_DEVICE {
    DWORD cb;
    TCHAR DeviceName[32];
    TCHAR DeviceString[128];
    DWORD StateFlags;
    TCHAR DeviceID[128];
    TCHAR DeviceKey[128];
}</code></pre>
 */
public class DISPLAY_DEVICE extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        CB,
        DEVICENAME,
        DEVICESTRING,
        STATEFLAGS,
        DEVICEID,
        DEVICEKEY;

    static {
        Layout layout = __struct(
            __member(4),
            __array(2, 32),
            __array(2, 128),
            __member(4),
            __array(2, 128),
            __array(2, 128)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        CB = layout.offsetof(0);
        DEVICENAME = layout.offsetof(1);
        DEVICESTRING = layout.offsetof(2);
        STATEFLAGS = layout.offsetof(3);
        DEVICEID = layout.offsetof(4);
        DEVICEKEY = layout.offsetof(5);
    }

    DISPLAY_DEVICE(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link DISPLAY_DEVICE} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public DISPLAY_DEVICE(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code cb} field. */
    public int cb() { return ncb(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code DeviceName} field. */
    public ByteBuffer DeviceName() { return nDeviceName(address()); }
    /** Decodes the null-terminated string stored in the {@code DeviceName} field. */
    public String DeviceNameString() { return nDeviceNameString(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code DeviceString} field. */
    public ByteBuffer DeviceString() { return nDeviceString(address()); }
    /** Decodes the null-terminated string stored in the {@code DeviceString} field. */
    public String DeviceStringString() { return nDeviceStringString(address()); }
    /** Returns the value of the {@code StateFlags} field. */
    public int StateFlags() { return nStateFlags(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code DeviceID} field. */
    public ByteBuffer DeviceID() { return nDeviceID(address()); }
    /** Decodes the null-terminated string stored in the {@code DeviceID} field. */
    public String DeviceIDString() { return nDeviceIDString(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code DeviceKey} field. */
    public ByteBuffer DeviceKey() { return nDeviceKey(address()); }
    /** Decodes the null-terminated string stored in the {@code DeviceKey} field. */
    public String DeviceKeyString() { return nDeviceKeyString(address()); }

    /** Sets the specified value to the {@code cb} field. */
    public DISPLAY_DEVICE cb(int value) { ncb(address(), value); return this; }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public DISPLAY_DEVICE set(DISPLAY_DEVICE src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link DISPLAY_DEVICE} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static DISPLAY_DEVICE malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link DISPLAY_DEVICE} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static DISPLAY_DEVICE calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link DISPLAY_DEVICE} instance allocated with {@link BufferUtils}. */
    public static DISPLAY_DEVICE create() {
        return new DISPLAY_DEVICE(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link DISPLAY_DEVICE} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static DISPLAY_DEVICE create(long address) {
        return address == NULL ? null : new DISPLAY_DEVICE(address, null);
    }

    /**
     * Returns a new {@link DISPLAY_DEVICE.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DISPLAY_DEVICE.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DISPLAY_DEVICE.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link DISPLAY_DEVICE.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link DISPLAY_DEVICE} instance allocated on the thread-local {@link MemoryStack}. */
    public static DISPLAY_DEVICE mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link DISPLAY_DEVICE} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static DISPLAY_DEVICE callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link DISPLAY_DEVICE} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static DISPLAY_DEVICE mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link DISPLAY_DEVICE} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static DISPLAY_DEVICE callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link DISPLAY_DEVICE.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link DISPLAY_DEVICE.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link DISPLAY_DEVICE.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link DISPLAY_DEVICE.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #cb}. */
    public static int ncb(long struct) { return memGetInt(struct + DISPLAY_DEVICE.CB); }
    /** Unsafe version of {@link #DeviceName}. */
    public static ByteBuffer nDeviceName(long struct) { return memByteBuffer(struct + DISPLAY_DEVICE.DEVICENAME, 32 * 2); }
    /** Unsafe version of {@link #DeviceNameString}. */
    public static String nDeviceNameString(long struct) { return memUTF16(struct + DISPLAY_DEVICE.DEVICENAME); }
    /** Unsafe version of {@link #DeviceString}. */
    public static ByteBuffer nDeviceString(long struct) { return memByteBuffer(struct + DISPLAY_DEVICE.DEVICESTRING, 128 * 2); }
    /** Unsafe version of {@link #DeviceStringString}. */
    public static String nDeviceStringString(long struct) { return memUTF16(struct + DISPLAY_DEVICE.DEVICESTRING); }
    /** Unsafe version of {@link #StateFlags}. */
    public static int nStateFlags(long struct) { return memGetInt(struct + DISPLAY_DEVICE.STATEFLAGS); }
    /** Unsafe version of {@link #DeviceID}. */
    public static ByteBuffer nDeviceID(long struct) { return memByteBuffer(struct + DISPLAY_DEVICE.DEVICEID, 128 * 2); }
    /** Unsafe version of {@link #DeviceIDString}. */
    public static String nDeviceIDString(long struct) { return memUTF16(struct + DISPLAY_DEVICE.DEVICEID); }
    /** Unsafe version of {@link #DeviceKey}. */
    public static ByteBuffer nDeviceKey(long struct) { return memByteBuffer(struct + DISPLAY_DEVICE.DEVICEKEY, 128 * 2); }
    /** Unsafe version of {@link #DeviceKeyString}. */
    public static String nDeviceKeyString(long struct) { return memUTF16(struct + DISPLAY_DEVICE.DEVICEKEY); }

    /** Unsafe version of {@link #cb(int) cb}. */
    public static void ncb(long struct, int value) { memPutInt(struct + DISPLAY_DEVICE.CB, value); }

    // -----------------------------------

    /** An array of {@link DISPLAY_DEVICE} structs. */
    public static class Buffer extends StructBuffer<DISPLAY_DEVICE, Buffer> implements NativeResource {

        /**
         * Creates a new {@link DISPLAY_DEVICE.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link DISPLAY_DEVICE#SIZEOF}, and its mark will be undefined.
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
        protected DISPLAY_DEVICE newInstance(long address) {
            return new DISPLAY_DEVICE(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code cb} field. */
        public int cb() { return DISPLAY_DEVICE.ncb(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code DeviceName} field. */
        public ByteBuffer DeviceName() { return DISPLAY_DEVICE.nDeviceName(address()); }
        /** Decodes the null-terminated string stored in the {@code DeviceName} field. */
        public String DeviceNameString() { return DISPLAY_DEVICE.nDeviceNameString(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code DeviceString} field. */
        public ByteBuffer DeviceString() { return DISPLAY_DEVICE.nDeviceString(address()); }
        /** Decodes the null-terminated string stored in the {@code DeviceString} field. */
        public String DeviceStringString() { return DISPLAY_DEVICE.nDeviceStringString(address()); }
        /** Returns the value of the {@code StateFlags} field. */
        public int StateFlags() { return DISPLAY_DEVICE.nStateFlags(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code DeviceID} field. */
        public ByteBuffer DeviceID() { return DISPLAY_DEVICE.nDeviceID(address()); }
        /** Decodes the null-terminated string stored in the {@code DeviceID} field. */
        public String DeviceIDString() { return DISPLAY_DEVICE.nDeviceIDString(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code DeviceKey} field. */
        public ByteBuffer DeviceKey() { return DISPLAY_DEVICE.nDeviceKey(address()); }
        /** Decodes the null-terminated string stored in the {@code DeviceKey} field. */
        public String DeviceKeyString() { return DISPLAY_DEVICE.nDeviceKeyString(address()); }

        /** Sets the specified value to the {@code cb} field. */
        public DISPLAY_DEVICE.Buffer cb(int value) { DISPLAY_DEVICE.ncb(address(), value); return this; }

    }

}