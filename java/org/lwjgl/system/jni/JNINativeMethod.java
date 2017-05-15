/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.system.jni;

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
 * struct JNINativeMethod {
 *     char * name;
 *     char * signature;
 *     void * fnPtr;
 * }</pre></code>
 */
public class JNINativeMethod extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        NAME,
        SIGNATURE,
        FNPTR;

    static {
        Layout layout = __struct(
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        NAME = layout.offsetof(0);
        SIGNATURE = layout.offsetof(1);
        FNPTR = layout.offsetof(2);
    }

    JNINativeMethod(long address, ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link JNINativeMethod} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public JNINativeMethod(ByteBuffer container) {
        this(memAddress(container), checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
    public ByteBuffer name() { return nname(address()); }
    /** Decodes the null-terminated string pointed to by the {@code name} field. */
    public String nameString() { return nnameString(address()); }
    /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code signature} field. */
    public ByteBuffer signature() { return nsignature(address()); }
    /** Decodes the null-terminated string pointed to by the {@code signature} field. */
    public String signatureString() { return nsignatureString(address()); }
    /** Returns the value of the {@code fnPtr} field. */
    public long fnPtr() { return nfnPtr(address()); }

    /** Sets the address of the specified encoded string to the {@code name} field. */
    public JNINativeMethod name(ByteBuffer value) { nname(address(), value); return this; }
    /** Sets the address of the specified encoded string to the {@code signature} field. */
    public JNINativeMethod signature(ByteBuffer value) { nsignature(address(), value); return this; }
    /** Sets the specified value to the {@code fnPtr} field. */
    public JNINativeMethod fnPtr(long value) { nfnPtr(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public JNINativeMethod set(
        ByteBuffer name,
        ByteBuffer signature,
        long fnPtr
    ) {
        name(name);
        signature(signature);
        fnPtr(fnPtr);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public JNINativeMethod set(JNINativeMethod src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link JNINativeMethod} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static JNINativeMethod malloc() {
        return create(nmemAlloc(SIZEOF));
    }

    /** Returns a new {@link JNINativeMethod} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static JNINativeMethod calloc() {
        return create(nmemCalloc(1, SIZEOF));
    }

    /** Returns a new {@link JNINativeMethod} instance allocated with {@link BufferUtils}. */
    public static JNINativeMethod create() {
        return new JNINativeMethod(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link JNINativeMethod} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
    public static JNINativeMethod create(long address) {
        return address == NULL ? null : new JNINativeMethod(address, null);
    }

    /**
     * Returns a new {@link JNINativeMethod.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return create(nmemAlloc(capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link JNINativeMethod.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return create(nmemCalloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link JNINativeMethod.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
    }

    /**
     * Create a {@link JNINativeMethod.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link JNINativeMethod} instance allocated on the thread-local {@link MemoryStack}. */
    public static JNINativeMethod mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link JNINativeMethod} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static JNINativeMethod callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link JNINativeMethod} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static JNINativeMethod mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link JNINativeMethod} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static JNINativeMethod callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link JNINativeMethod.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link JNINativeMethod.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link JNINativeMethod.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link JNINativeMethod.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #name}. */
    public static ByteBuffer nname(long struct) { return memByteBufferNT1(memGetAddress(struct + JNINativeMethod.NAME)); }
    /** Unsafe version of {@link #nameString}. */
    public static String nnameString(long struct) { return memUTF8(memGetAddress(struct + JNINativeMethod.NAME)); }
    /** Unsafe version of {@link #signature}. */
    public static ByteBuffer nsignature(long struct) { return memByteBufferNT1(memGetAddress(struct + JNINativeMethod.SIGNATURE)); }
    /** Unsafe version of {@link #signatureString}. */
    public static String nsignatureString(long struct) { return memUTF8(memGetAddress(struct + JNINativeMethod.SIGNATURE)); }
    /** Unsafe version of {@link #fnPtr}. */
    public static long nfnPtr(long struct) { return memGetAddress(struct + JNINativeMethod.FNPTR); }

    /** Unsafe version of {@link #name(ByteBuffer) name}. */
    public static void nname(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + JNINativeMethod.NAME, memAddress(value));
    }
    /** Unsafe version of {@link #signature(ByteBuffer) signature}. */
    public static void nsignature(long struct, ByteBuffer value) {
        if (CHECKS) { checkNT1Safe(value); }
        memPutAddress(struct + JNINativeMethod.SIGNATURE, memAddress(value));
    }
    /** Unsafe version of {@link #fnPtr(long) fnPtr}. */
    public static void nfnPtr(long struct, long value) { memPutAddress(struct + JNINativeMethod.FNPTR, check(value)); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + JNINativeMethod.NAME));
        check(memGetAddress(struct + JNINativeMethod.SIGNATURE));
        check(memGetAddress(struct + JNINativeMethod.FNPTR));
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

    /** An array of {@link JNINativeMethod} structs. */
    public static class Buffer extends StructBuffer<JNINativeMethod, Buffer> implements NativeResource {

        /**
         * Creates a new {@link JNINativeMethod.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link JNINativeMethod#SIZEOF}, and its mark will be undefined.
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
        protected JNINativeMethod newInstance(long address) {
            return new JNINativeMethod(address, container);
        }

        @Override
        protected int sizeof() {
            return SIZEOF;
        }

        /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code name} field. */
        public ByteBuffer name() { return JNINativeMethod.nname(address()); }
        /** Decodes the null-terminated string pointed to by the {@code name} field. */
        public String nameString() { return JNINativeMethod.nnameString(address()); }
        /** Returns a {@link ByteBuffer} view of the null-terminated string pointed to by the {@code signature} field. */
        public ByteBuffer signature() { return JNINativeMethod.nsignature(address()); }
        /** Decodes the null-terminated string pointed to by the {@code signature} field. */
        public String signatureString() { return JNINativeMethod.nsignatureString(address()); }
        /** Returns the value of the {@code fnPtr} field. */
        public long fnPtr() { return JNINativeMethod.nfnPtr(address()); }

        /** Sets the address of the specified encoded string to the {@code name} field. */
        public JNINativeMethod.Buffer name(ByteBuffer value) { JNINativeMethod.nname(address(), value); return this; }
        /** Sets the address of the specified encoded string to the {@code signature} field. */
        public JNINativeMethod.Buffer signature(ByteBuffer value) { JNINativeMethod.nsignature(address(), value); return this; }
        /** Sets the specified value to the {@code fnPtr} field. */
        public JNINativeMethod.Buffer fnPtr(long value) { JNINativeMethod.nfnPtr(address(), value); return this; }

    }

}