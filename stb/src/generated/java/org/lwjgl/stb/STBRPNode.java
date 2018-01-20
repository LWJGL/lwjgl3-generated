/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * The opaque {@code stbrp_node} struct.
 * 
 * <h3>Layout</h3>
 * 
 * <code><pre>
 * struct stbrp_node {
 *     stbrp_coord x;
 *     stbrp_coord y;
 *     {@link STBRPNode stbrp_node} * next;
 * }</pre></code>
 */
@NativeType("struct stbrp_node")
public class STBRPNode extends Struct {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        X,
        Y,
        NEXT;

    static {
        Layout layout = __struct(
            __member(2),
            __member(2),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        X = layout.offsetof(0);
        Y = layout.offsetof(1);
        NEXT = layout.offsetof(2);
    }

    STBRPNode(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link STBRPNode} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public STBRPNode(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code x} field. */
    @NativeType("stbrp_coord")
    public short x() { return nx(address()); }
    /** Returns the value of the {@code y} field. */
    @NativeType("stbrp_coord")
    public short y() { return ny(address()); }
    /** Returns a {@link STBRPNode} view of the struct pointed to by the {@code next} field. */
    @Nullable
    @NativeType("stbrp_node *")
    public STBRPNode next() { return nnext(address()); }

    // -----------------------------------

    /** Returns a new {@link STBRPNode} instance for the specified memory address. */
    public static STBRPNode create(long address) {
        return new STBRPNode(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static STBRPNode createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Create a {@link STBRPNode.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static STBRPNode.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static STBRPNode.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #x}. */
    public static short nx(long struct) { return memGetShort(struct + STBRPNode.X); }
    /** Unsafe version of {@link #y}. */
    public static short ny(long struct) { return memGetShort(struct + STBRPNode.Y); }
    /** Unsafe version of {@link #next}. */
    @Nullable public static STBRPNode nnext(long struct) { return STBRPNode.createSafe(memGetAddress(struct + STBRPNode.NEXT)); }

    // -----------------------------------

    /** An array of {@link STBRPNode} structs. */
    public static class Buffer extends StructBuffer<STBRPNode, Buffer> {

        /**
         * Creates a new {@link STBRPNode.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link STBRPNode#SIZEOF}, and its mark will be undefined.
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
        protected STBRPNode newInstance(long address) {
            return new STBRPNode(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code x} field. */
        @NativeType("stbrp_coord")
        public short x() { return STBRPNode.nx(address()); }
        /** Returns the value of the {@code y} field. */
        @NativeType("stbrp_coord")
        public short y() { return STBRPNode.ny(address()); }
        /** Returns a {@link STBRPNode} view of the struct pointed to by the {@code next} field. */
        @Nullable
        @NativeType("stbrp_node *")
        public STBRPNode next() { return STBRPNode.nnext(address()); }

    }

}