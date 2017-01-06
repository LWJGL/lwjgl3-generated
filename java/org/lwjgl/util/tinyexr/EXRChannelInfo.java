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
 * <pre><code>struct EXRChannelInfo {
    char name[256];
    int pixel_type;
    int x_sampling;
    int y_sampling;
    unsigned char p_linear;
    char[3];
}</code></pre>
 */
public class EXRChannelInfo extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		NAME,
		PIXEL_TYPE,
		X_SAMPLING,
		Y_SAMPLING,
		P_LINEAR;

	static {
		Layout layout = __struct(
			__array(1, 256),
			__member(4),
			__member(4),
			__member(4),
			__member(1),
			__padding(3, true)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		NAME = layout.offsetof(0);
		PIXEL_TYPE = layout.offsetof(1);
		X_SAMPLING = layout.offsetof(2);
		Y_SAMPLING = layout.offsetof(3);
		P_LINEAR = layout.offsetof(4);
	}

	EXRChannelInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link EXRChannelInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public EXRChannelInfo(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link ByteBuffer} view of the {@code name} field. */
	public ByteBuffer name() { return nname(address()); }
	/** Decodes the null-terminated string stored in the {@code name} field. */
	public String nameString() { return nnameString(address()); }
	/** Returns the value of the {@code pixel_type} field. */
	public int pixel_type() { return npixel_type(address()); }
	/** Returns the value of the {@code x_sampling} field. */
	public int x_sampling() { return nx_sampling(address()); }
	/** Returns the value of the {@code y_sampling} field. */
	public int y_sampling() { return ny_sampling(address()); }
	/** Returns the value of the {@code p_linear} field. */
	public byte p_linear() { return np_linear(address()); }

	/** Copies the specified encoded string to the {@code name} field. */
	public EXRChannelInfo name(ByteBuffer value) { nname(address(), value); return this; }
	/** Sets the specified value to the {@code pixel_type} field. */
	public EXRChannelInfo pixel_type(int value) { npixel_type(address(), value); return this; }
	/** Sets the specified value to the {@code x_sampling} field. */
	public EXRChannelInfo x_sampling(int value) { nx_sampling(address(), value); return this; }
	/** Sets the specified value to the {@code y_sampling} field. */
	public EXRChannelInfo y_sampling(int value) { ny_sampling(address(), value); return this; }
	/** Sets the specified value to the {@code p_linear} field. */
	public EXRChannelInfo p_linear(byte value) { np_linear(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public EXRChannelInfo set(
		ByteBuffer name,
		int pixel_type,
		int x_sampling,
		int y_sampling,
		byte p_linear
	) {
		name(name);
		pixel_type(pixel_type);
		x_sampling(x_sampling);
		y_sampling(y_sampling);
		p_linear(p_linear);

		return this;
	}

	/** Unsafe version of {@link #set(EXRChannelInfo) set}. */
	public EXRChannelInfo nset(long struct) {
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
	public EXRChannelInfo set(EXRChannelInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link EXRChannelInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static EXRChannelInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link EXRChannelInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static EXRChannelInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link EXRChannelInfo} instance allocated with {@link BufferUtils}. */
	public static EXRChannelInfo create() {
		return new EXRChannelInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link EXRChannelInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static EXRChannelInfo create(long address) {
		return address == NULL ? null : new EXRChannelInfo(address, null);
	}

	/**
	 * Returns a new {@link EXRChannelInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link EXRChannelInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link EXRChannelInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link EXRChannelInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link EXRChannelInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static EXRChannelInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link EXRChannelInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static EXRChannelInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link EXRChannelInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static EXRChannelInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link EXRChannelInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static EXRChannelInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link EXRChannelInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link EXRChannelInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link EXRChannelInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link EXRChannelInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #name}. */
	public static ByteBuffer nname(long struct) { return memByteBuffer(struct + EXRChannelInfo.NAME, 256); }
	/** Unsafe version of {@link #nameString}. */
	public static String nnameString(long struct) { return memASCII(struct + EXRChannelInfo.NAME); }
	/** Unsafe version of {@link #pixel_type}. */
	public static int npixel_type(long struct) { return memGetInt(struct + EXRChannelInfo.PIXEL_TYPE); }
	/** Unsafe version of {@link #x_sampling}. */
	public static int nx_sampling(long struct) { return memGetInt(struct + EXRChannelInfo.X_SAMPLING); }
	/** Unsafe version of {@link #y_sampling}. */
	public static int ny_sampling(long struct) { return memGetInt(struct + EXRChannelInfo.Y_SAMPLING); }
	/** Unsafe version of {@link #p_linear}. */
	public static byte np_linear(long struct) { return memGetByte(struct + EXRChannelInfo.P_LINEAR); }

	/** Unsafe version of {@link #name(ByteBuffer) name}. */
	public static void nname(long struct, ByteBuffer value) {
		if ( CHECKS ) {
			checkNT1(value);
			checkGT(value, 256);
		}
		memCopy(memAddress(value), struct + EXRChannelInfo.NAME, value.remaining());
	}
	/** Unsafe version of {@link #pixel_type(int) pixel_type}. */
	public static void npixel_type(long struct, int value) { memPutInt(struct + EXRChannelInfo.PIXEL_TYPE, value); }
	/** Unsafe version of {@link #x_sampling(int) x_sampling}. */
	public static void nx_sampling(long struct, int value) { memPutInt(struct + EXRChannelInfo.X_SAMPLING, value); }
	/** Unsafe version of {@link #y_sampling(int) y_sampling}. */
	public static void ny_sampling(long struct, int value) { memPutInt(struct + EXRChannelInfo.Y_SAMPLING, value); }
	/** Unsafe version of {@link #p_linear(byte) p_linear}. */
	public static void np_linear(long struct, byte value) { memPutByte(struct + EXRChannelInfo.P_LINEAR, value); }

	// -----------------------------------

	/** An array of {@link EXRChannelInfo} structs. */
	public static class Buffer extends StructBuffer<EXRChannelInfo, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link EXRChannelInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link EXRChannelInfo#SIZEOF}, and its mark will be undefined.
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
		protected EXRChannelInfo newInstance(long address) {
			return new EXRChannelInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link ByteBuffer} view of the {@code name} field. */
		public ByteBuffer name() { return EXRChannelInfo.nname(address()); }
		/** Decodes the null-terminated string stored in the {@code name} field. */
		public String nameString() { return EXRChannelInfo.nnameString(address()); }
		/** Returns the value of the {@code pixel_type} field. */
		public int pixel_type() { return EXRChannelInfo.npixel_type(address()); }
		/** Returns the value of the {@code x_sampling} field. */
		public int x_sampling() { return EXRChannelInfo.nx_sampling(address()); }
		/** Returns the value of the {@code y_sampling} field. */
		public int y_sampling() { return EXRChannelInfo.ny_sampling(address()); }
		/** Returns the value of the {@code p_linear} field. */
		public byte p_linear() { return EXRChannelInfo.np_linear(address()); }

		/** Copies the specified encoded string to the {@code name} field. */
		public EXRChannelInfo.Buffer name(ByteBuffer value) { EXRChannelInfo.nname(address(), value); return this; }
		/** Sets the specified value to the {@code pixel_type} field. */
		public EXRChannelInfo.Buffer pixel_type(int value) { EXRChannelInfo.npixel_type(address(), value); return this; }
		/** Sets the specified value to the {@code x_sampling} field. */
		public EXRChannelInfo.Buffer x_sampling(int value) { EXRChannelInfo.nx_sampling(address(), value); return this; }
		/** Sets the specified value to the {@code y_sampling} field. */
		public EXRChannelInfo.Buffer y_sampling(int value) { EXRChannelInfo.ny_sampling(address(), value); return this; }
		/** Sets the specified value to the {@code p_linear} field. */
		public EXRChannelInfo.Buffer p_linear(byte value) { EXRChannelInfo.np_linear(address(), value); return this; }

	}

}