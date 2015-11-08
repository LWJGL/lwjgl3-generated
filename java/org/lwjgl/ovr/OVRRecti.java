/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** A 2D rectangle with a position and size. All components are integers. */
public class OVRRecti extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		POS,
		SIZE;

	static {
		IntBuffer offsets = memAllocInt(2);

		SIZEOF = offsets(memAddress(offsets));

		POS = offsets.get(0);
		SIZE = offsets.get(1);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	OVRRecti(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRRecti} instance at the specified memory address. */
	public OVRRecti(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRRecti} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRRecti(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public OVRVector2i getPos() { return ngetPos(address()); }
	public int getPosX() { return ngetPosX(address()); }
	public int getPosY() { return ngetPosY(address()); }
	public OVRSizei getSize() { return ngetSize(address()); }
	public int getSizeW() { return ngetSizeW(address()); }
	public int getSizeH() { return ngetSizeH(address()); }

	public OVRRecti setPos(OVRVector2i Pos) { nsetPos(address(), Pos); return this; }
	public OVRRecti setPosX(int x) { nsetPosX(address(), x); return this; }
	public OVRRecti setPosY(int y) { nsetPosY(address(), y); return this; }
	public OVRRecti setSize(OVRSizei Size) { nsetSize(address(), Size); return this; }
	public OVRRecti setSizeW(int w) { nsetSizeW(address(), w); return this; }
	public OVRRecti setSizeH(int h) { nsetSizeH(address(), h); return this; }

	/** Initializes this struct with the specified values. */
	public OVRRecti set(
		OVRVector2i Pos,
		OVRSizei Size
	) {
		setPos(Pos);
		setSize(Size);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public OVRRecti nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public OVRRecti set(OVRRecti src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public OVRRecti set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRRecti} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRRecti malloc() {
		return new OVRRecti(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRRecti} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRRecti calloc() {
		return new OVRRecti(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRRecti} instance allocated with {@link BufferUtils}. */
	public static OVRRecti create() {
		return new OVRRecti(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRRecti.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRRecti.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRRecti.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link OVRRecti.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	public static OVRVector2i ngetPos(long struct) { return OVRVector2i.malloc().nset(struct + POS); }
	/** Returns a copy of the {@code Pos} {@link OVRVector2i} struct. */
	public static OVRVector2i getPos(ByteBuffer struct) { return ngetPos(memAddress(struct)); }
	public static int ngetPosX(long struct) { return memGetInt(struct + POS + OVRVector2i.X); }
	public static int getPosX(ByteBuffer struct) { return ngetPosX(memAddress(struct)); }
	public static int ngetPosY(long struct) { return memGetInt(struct + POS + OVRVector2i.Y); }
	public static int getPosY(ByteBuffer struct) { return ngetPosY(memAddress(struct)); }
	public static OVRSizei ngetSize(long struct) { return OVRSizei.malloc().nset(struct + SIZE); }
	/** Returns a copy of the {@code Size} {@link OVRSizei} struct. */
	public static OVRSizei getSize(ByteBuffer struct) { return ngetSize(memAddress(struct)); }
	public static int ngetSizeW(long struct) { return memGetInt(struct + SIZE + OVRSizei.W); }
	public static int getSizeW(ByteBuffer struct) { return ngetSizeW(memAddress(struct)); }
	public static int ngetSizeH(long struct) { return memGetInt(struct + SIZE + OVRSizei.H); }
	public static int getSizeH(ByteBuffer struct) { return ngetSizeH(memAddress(struct)); }

	public static void nsetPos(long struct, OVRVector2i Pos) { memCopy(Pos.address(), struct + POS, OVRVector2i.SIZEOF); }
	/** Copies the specified {@link OVRVector2i} struct to the nested {@code Pos} struct. */
	public static void setPos(ByteBuffer struct, OVRVector2i Pos) { nsetPos(memAddress(struct), Pos); }
	public static void nsetPosX(long struct, int x) { memPutInt(struct + POS + OVRVector2i.X, x); }
	public static void setPosX(ByteBuffer struct, int x) { nsetPosX(memAddress(struct), x); }
	public static void nsetPosY(long struct, int y) { memPutInt(struct + POS + OVRVector2i.Y, y); }
	public static void setPosY(ByteBuffer struct, int y) { nsetPosY(memAddress(struct), y); }
	public static void nsetSize(long struct, OVRSizei Size) { memCopy(Size.address(), struct + SIZE, OVRSizei.SIZEOF); }
	/** Copies the specified {@link OVRSizei} struct to the nested {@code Size} struct. */
	public static void setSize(ByteBuffer struct, OVRSizei Size) { nsetSize(memAddress(struct), Size); }
	public static void nsetSizeW(long struct, int w) { memPutInt(struct + SIZE + OVRSizei.W, w); }
	public static void setSizeW(ByteBuffer struct, int w) { nsetSizeW(memAddress(struct), w); }
	public static void nsetSizeH(long struct, int h) { memPutInt(struct + SIZE + OVRSizei.H, h); }
	public static void setSizeH(ByteBuffer struct, int h) { nsetSizeH(memAddress(struct), h); }

	// -----------------------------------

	/** An array of {@link OVRRecti} structs. */
	public static final class Buffer extends StructBuffer<OVRRecti, Buffer> {

		/**
		 * Creates a new {@link OVRRecti.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRRecti#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			this(container.slice(), SIZEOF);
		}

		Buffer(ByteBuffer container, int SIZEOF) {
			super(container, SIZEOF);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(ByteBuffer buffer) {
			return new Buffer(buffer);
		}

		@Override
		protected OVRRecti newInstance(long address) {
			return new OVRRecti(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public OVRVector2i getPos() { return ngetPos(address()); }
		public int getPosX() { return ngetPosX(address()); }
		public int getPosY() { return ngetPosY(address()); }
		public OVRSizei getSize() { return ngetSize(address()); }
		public int getSizeW() { return ngetSizeW(address()); }
		public int getSizeH() { return ngetSizeH(address()); }

		public OVRRecti.Buffer setPos(OVRVector2i Pos) { nsetPos(address(), Pos); return this; }
		public OVRRecti.Buffer setPosX(int x) { nsetPosX(address(), x); return this; }
		public OVRRecti.Buffer setPosY(int y) { nsetPosY(address(), y); return this; }
		public OVRRecti.Buffer setSize(OVRSizei Size) { nsetSize(address(), Size); return this; }
		public OVRRecti.Buffer setSizeW(int w) { nsetSizeW(address(), w); return this; }
		public OVRRecti.Buffer setSizeH(int h) { nsetSizeH(address(), h); return this; }

	}

}