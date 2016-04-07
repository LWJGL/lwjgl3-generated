/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Packed character data, returned by {@link STBTruetype#stbtt_PackFontRange}
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct stbtt_packedchar {
    unsigned short x0;
    unsigned short y0;
    unsigned short x1;
    unsigned short y1;
    float xoff;
    float yoff;
    float xadvance;
    float xoff2;
    float yoff2;
}</code></pre>
 */
public class STBTTPackedchar extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		X0,
		Y0,
		X1,
		Y1,
		XOFF,
		YOFF,
		XADVANCE,
		XOFF2,
		YOFF2;

	static {
		Layout layout = __struct(
			__member(2),
			__member(2),
			__member(2),
			__member(2),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		X0 = layout.offsetof(0);
		Y0 = layout.offsetof(1);
		X1 = layout.offsetof(2);
		Y1 = layout.offsetof(3);
		XOFF = layout.offsetof(4);
		YOFF = layout.offsetof(5);
		XADVANCE = layout.offsetof(6);
		XOFF2 = layout.offsetof(7);
		YOFF2 = layout.offsetof(8);
	}

	STBTTPackedchar(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link STBTTPackedchar} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public STBTTPackedchar(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code x0} field. */
	public short x0() { return nx0(address()); }
	/** Returns the value of the {@code y0} field. */
	public short y0() { return ny0(address()); }
	/** Returns the value of the {@code x1} field. */
	public short x1() { return nx1(address()); }
	/** Returns the value of the {@code y1} field. */
	public short y1() { return ny1(address()); }
	/** Returns the value of the {@code xoff} field. */
	public float xoff() { return nxoff(address()); }
	/** Returns the value of the {@code yoff} field. */
	public float yoff() { return nyoff(address()); }
	/** Returns the value of the {@code xadvance} field. */
	public float xadvance() { return nxadvance(address()); }
	/** Returns the value of the {@code xoff2} field. */
	public float xoff2() { return nxoff2(address()); }
	/** Returns the value of the {@code yoff2} field. */
	public float yoff2() { return nyoff2(address()); }

	// -----------------------------------

	/** Returns a new {@link STBTTPackedchar} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static STBTTPackedchar malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link STBTTPackedchar} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static STBTTPackedchar calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link STBTTPackedchar} instance allocated with {@link BufferUtils}. */
	public static STBTTPackedchar create() {
		return new STBTTPackedchar(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link STBTTPackedchar} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static STBTTPackedchar create(long address) {
		return address == NULL ? null : new STBTTPackedchar(address, null);
	}

	/**
	 * Returns a new {@link STBTTPackedchar.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link STBTTPackedchar.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link STBTTPackedchar.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link STBTTPackedchar.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link STBTTPackedchar} instance allocated on the thread-local {@link MemoryStack}. */
	public static STBTTPackedchar mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link STBTTPackedchar} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static STBTTPackedchar callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link STBTTPackedchar} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static STBTTPackedchar mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link STBTTPackedchar} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static STBTTPackedchar callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link STBTTPackedchar.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link STBTTPackedchar.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link STBTTPackedchar.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link STBTTPackedchar.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #x0}. */
	public static short nx0(long struct) { return memGetShort(struct + STBTTPackedchar.X0); }
	/** Unsafe version of {@link #y0}. */
	public static short ny0(long struct) { return memGetShort(struct + STBTTPackedchar.Y0); }
	/** Unsafe version of {@link #x1}. */
	public static short nx1(long struct) { return memGetShort(struct + STBTTPackedchar.X1); }
	/** Unsafe version of {@link #y1}. */
	public static short ny1(long struct) { return memGetShort(struct + STBTTPackedchar.Y1); }
	/** Unsafe version of {@link #xoff}. */
	public static float nxoff(long struct) { return memGetFloat(struct + STBTTPackedchar.XOFF); }
	/** Unsafe version of {@link #yoff}. */
	public static float nyoff(long struct) { return memGetFloat(struct + STBTTPackedchar.YOFF); }
	/** Unsafe version of {@link #xadvance}. */
	public static float nxadvance(long struct) { return memGetFloat(struct + STBTTPackedchar.XADVANCE); }
	/** Unsafe version of {@link #xoff2}. */
	public static float nxoff2(long struct) { return memGetFloat(struct + STBTTPackedchar.XOFF2); }
	/** Unsafe version of {@link #yoff2}. */
	public static float nyoff2(long struct) { return memGetFloat(struct + STBTTPackedchar.YOFF2); }

	// -----------------------------------

	/** An array of {@link STBTTPackedchar} structs. */
	public static final class Buffer extends StructBuffer<STBTTPackedchar, Buffer> {

		/**
		 * Creates a new {@link STBTTPackedchar.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link STBTTPackedchar#SIZEOF}, and its mark will be undefined.
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
		protected STBTTPackedchar newInstance(long address) {
			return new STBTTPackedchar(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code x0} field. */
		public short x0() { return STBTTPackedchar.nx0(address()); }
		/** Returns the value of the {@code y0} field. */
		public short y0() { return STBTTPackedchar.ny0(address()); }
		/** Returns the value of the {@code x1} field. */
		public short x1() { return STBTTPackedchar.nx1(address()); }
		/** Returns the value of the {@code y1} field. */
		public short y1() { return STBTTPackedchar.ny1(address()); }
		/** Returns the value of the {@code xoff} field. */
		public float xoff() { return STBTTPackedchar.nxoff(address()); }
		/** Returns the value of the {@code yoff} field. */
		public float yoff() { return STBTTPackedchar.nyoff(address()); }
		/** Returns the value of the {@code xadvance} field. */
		public float xadvance() { return STBTTPackedchar.nxadvance(address()); }
		/** Returns the value of the {@code xoff2} field. */
		public float xoff2() { return STBTTPackedchar.nxoff2(address()); }
		/** Returns the value of the {@code yoff2} field. */
		public float yoff2() { return STBTTPackedchar.nyoff2(address()); }

	}

}