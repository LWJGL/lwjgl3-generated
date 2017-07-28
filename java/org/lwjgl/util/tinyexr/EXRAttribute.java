/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.util.tinyexr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct EXRAttribute {
 *     char name[256];
 *     char type[256];
 *     unsigned char * value;
 *     int size;
 *     char[4];
 * }</pre></code>
 */
public class EXRAttribute extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        TYPE,
        VALUE,
        SIZE;

    static {
        Layout layout = __struct(
            __array(1, 256),
            __array(1, 256),
            __member(POINTER_SIZE),
            __member(4),
            __padding(4, true)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        TYPE = layout.offsetof(1);
        VALUE = layout.offsetof(2);
        SIZE = layout.offsetof(3);
    }

    EXRAttribute(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link EXRAttribute} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public EXRAttribute(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link ByteBuffer} view of the {@code name} field. */
    @NativeType("char[256]")
    public ByteBuffer name() { return nname(address()); }
    /** Decodes the null-terminated string stored in the {@code name} field. */
    @NativeType("char[256]")
    public String nameString() { return nnameString(address()); }
    /** Returns a {@link ByteBuffer} view of the {@code type} field. */
    @NativeType("char[256]")
    public ByteBuffer type() { return ntype(address()); }
    /** Decodes the null-terminated string stored in the {@code type} field. */
    @NativeType("char[256]")
    public String typeString() { return ntypeString(address()); }
    /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code value} field. */
    @NativeType("unsigned char *")
    public ByteBuffer value() { return nvalue(address()); }
    /** Returns the value of the {@code size} field. */
    public int size() { return nsize(address()); }

    /** Copies the specified encoded string to the {@code name} field. */
    public EXRAttribute name(@NativeType("char[256]") ByteBuffer value) { nname(address(), value); return this; }
    /** Copies the specified encoded string to the {@code type} field. */
    public EXRAttribute type(@NativeType("char[256]") ByteBuffer value) { ntype(address(), value); return this; }
    /** Sets the address of the specified {@link ByteBuffer} to the {@code value} field. */
    public EXRAttribute value(@NativeType("unsigned char *") ByteBuffer value) { nvalue(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public EXRAttribute set(
        ByteBuffer name,
        ByteBuffer type,
        ByteBuffer value
    ) {
        name(name);
        type(type);
        value(value);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public EXRAttribute set(EXRAttribute src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link EXRAttribute} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static EXRAttribute malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link EXRAttribute} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static EXRAttribute calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link EXRAttribute} instance allocated with {@link BufferUtils}. */
    public static EXRAttribute create() {
        return new EXRAttribute(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link EXRAttribute} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static EXRAttribute create(long address) {
        return address == NULL ? null : new EXRAttribute(address, null);
    }

    /**
     * Returns a new {@link EXRAttribute.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link EXRAttribute.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link EXRAttribute.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link EXRAttribute.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link EXRAttribute} instance allocated on the thread-local {@link MemoryStack}. */
    public static EXRAttribute mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link EXRAttribute} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static EXRAttribute callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link EXRAttribute} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static EXRAttribute mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link EXRAttribute} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static EXRAttribute callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link EXRAttribute.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link EXRAttribute.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link EXRAttribute.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link EXRAttribute.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBuffer(struct + EXRAttribute.NAME, 256); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memASCII(struct + EXRAttribute.NAME); }
    /** Unsafe version of {@link #type}. */
    public static ByteBuffer ntype(long struct) { return memByteBuffer(struct + EXRAttribute.TYPE, 256); }
    /** Unsafe version of {@link #typeString}. */
    public static String ntypeString(long struct) { return memASCII(struct + EXRAttribute.TYPE); }
    /** Unsafe version of {@link #value() value}. */
    public static ByteBuffer nvalue(long struct) { return memByteBuffer(memGetAddress(struct + EXRAttribute.VALUE), nsize(struct)); }
    /** Unsafe version of {@link #size}. */
    public static int nsize(long struct) { return memGetInt(struct + EXRAttribute.SIZE); }

    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, 256);
        }
        memCopy(memAddress(value), struct + EXRAttribute.NAME, value.remaining());
    }
    /** Unsafe version of {@link #type(ByteBuffer) type}. */
    public static void ntype(long struct, ByteBuffer value) {
        if (CHECKS) {
            checkNT1(value);
            checkGT(value, 256);
        }
        memCopy(memAddress(value), struct + EXRAttribute.TYPE, value.remaining());
    }
    /** Unsafe version of {@link #value(ByteBuffer) value}. */
    public static void nvalue(long struct, ByteBuffer value) { memPutAddress(struct + EXRAttribute.VALUE, memAddressSafe(value)); nsize(struct, value == null ? 0 : value.remaining()); }
    /** Sets the specified value to the {@code size} field of the specified {@code struct}. */
    public static void nsize(long struct, int value) { memPutInt(struct + EXRAttribute.SIZE, value); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nsize(struct) != 0) {
            check(memGetAddress(struct + EXRAttribute.VALUE));
        }
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link EXRAttribute} structs. */
    public static class Buffer extends StructBuffer<EXRAttribute, Buffer> implements NativeResource {

        /**
         * Creates a new {@link EXRAttribute.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link EXRAttribute#SIZEOF}, and its mark will be undefined.
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
        protected EXRAttribute newInstance(long address) {
            return new EXRAttribute(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link ByteBuffer} view of the {@code name} field. */
        @NativeType("char[256]")
        public ByteBuffer name() { return EXRAttribute.nname(address()); }
        /** Decodes the null-terminated string stored in the {@code name} field. */
        @NativeType("char[256]")
        public String nameString() { return EXRAttribute.nnameString(address()); }
        /** Returns a {@link ByteBuffer} view of the {@code type} field. */
        @NativeType("char[256]")
        public ByteBuffer type() { return EXRAttribute.ntype(address()); }
        /** Decodes the null-terminated string stored in the {@code type} field. */
        @NativeType("char[256]")
        public String typeString() { return EXRAttribute.ntypeString(address()); }
        /** Returns a {@link ByteBuffer} view of the data pointed to by the {@code value} field. */
        @NativeType("unsigned char *")
        public ByteBuffer value() { return EXRAttribute.nvalue(address()); }
        /** Returns the value of the {@code size} field. */
        public int size() { return EXRAttribute.nsize(address()); }

        /** Copies the specified encoded string to the {@code name} field. */
        public EXRAttribute.Buffer name(@NativeType("char[256]") ByteBuffer value) { EXRAttribute.nname(address(), value); return this; }
        /** Copies the specified encoded string to the {@code type} field. */
        public EXRAttribute.Buffer type(@NativeType("char[256]") ByteBuffer value) { EXRAttribute.ntype(address(), value); return this; }
        /** Sets the address of the specified {@link ByteBuffer} to the {@code value} field. */
        public EXRAttribute.Buffer value(@NativeType("unsigned char *") ByteBuffer value) { EXRAttribute.nvalue(address(), value); return this; }

    }

}