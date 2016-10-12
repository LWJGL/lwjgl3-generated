/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.bgfx;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * HMD info.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code width} &ndash; framebuffer width</li>
 * <li>{@code height} &ndash; framebuffer height</li>
 * <li>{@code deviceWidth} &ndash; device resolution width</li>
 * <li>{@code deviceHeight} &ndash; device resolution height</li>
 * <li>{@code flags} &ndash; status flags</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct bgfx_hmd_t {
    {@link BGFXHmdEye bgfx_hmd_eye_t} eye[2];
    uint16_t width;
    uint16_t height;
    uint32_t deviceWidth;
    uint32_t deviceHeight;
    uint8_t flags;
}</code></pre>
 */
public class BGFXHmd extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		EYE,
		WIDTH,
		HEIGHT,
		DEVICEWIDTH,
		DEVICEHEIGHT,
		FLAGS;

	static {
		Layout layout = __struct(
			__array(BGFXHmdEye.SIZEOF, BGFXHmdEye.ALIGNOF, 2),
			__member(2),
			__member(2),
			__member(4),
			__member(4),
			__member(1)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		EYE = layout.offsetof(0);
		WIDTH = layout.offsetof(1);
		HEIGHT = layout.offsetof(2);
		DEVICEWIDTH = layout.offsetof(3);
		DEVICEHEIGHT = layout.offsetof(4);
		FLAGS = layout.offsetof(5);
	}

	BGFXHmd(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link BGFXHmd} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public BGFXHmd(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link BGFXHmdEye}.Buffer view of the {@code eye} field. */
	public BGFXHmdEye.Buffer eye() { return neye(address()); }
	/** Returns a {@link BGFXHmdEye} view of the struct at the specified index of the {@code eye} field. */
	public BGFXHmdEye eye(int index) { return neye(address(), index); }
	/** Returns the value of the {@code width} field. */
	public short width() { return nwidth(address()); }
	/** Returns the value of the {@code height} field. */
	public short height() { return nheight(address()); }
	/** Returns the value of the {@code deviceWidth} field. */
	public int deviceWidth() { return ndeviceWidth(address()); }
	/** Returns the value of the {@code deviceHeight} field. */
	public int deviceHeight() { return ndeviceHeight(address()); }
	/** Returns the value of the {@code flags} field. */
	public byte flags() { return nflags(address()); }

	// -----------------------------------

	/** Returns a new {@link BGFXHmd} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static BGFXHmd create(long address) {
		return address == NULL ? null : new BGFXHmd(address, null);
	}

	/**
	 * Create a {@link BGFXHmd.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #eye}. */
	public static BGFXHmdEye.Buffer neye(long struct) {
		return BGFXHmdEye.create(struct + BGFXHmd.EYE, 2);
	}
	/** Unsafe version of {@link #eye(int) eye}. */
	public static BGFXHmdEye neye(long struct, int index) {
		return BGFXHmdEye.create(struct + BGFXHmd.EYE + index * BGFXHmdEye.SIZEOF);
	}
	/** Unsafe version of {@link #width}. */
	public static short nwidth(long struct) { return memGetShort(struct + BGFXHmd.WIDTH); }
	/** Unsafe version of {@link #height}. */
	public static short nheight(long struct) { return memGetShort(struct + BGFXHmd.HEIGHT); }
	/** Unsafe version of {@link #deviceWidth}. */
	public static int ndeviceWidth(long struct) { return memGetInt(struct + BGFXHmd.DEVICEWIDTH); }
	/** Unsafe version of {@link #deviceHeight}. */
	public static int ndeviceHeight(long struct) { return memGetInt(struct + BGFXHmd.DEVICEHEIGHT); }
	/** Unsafe version of {@link #flags}. */
	public static byte nflags(long struct) { return memGetByte(struct + BGFXHmd.FLAGS); }

	// -----------------------------------

	/** An array of {@link BGFXHmd} structs. */
	public static class Buffer extends StructBuffer<BGFXHmd, Buffer> {

		/**
		 * Creates a new {@link BGFXHmd.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link BGFXHmd#SIZEOF}, and its mark will be undefined.
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
		protected BGFXHmd newInstance(long address) {
			return new BGFXHmd(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link BGFXHmdEye}.Buffer view of the {@code eye} field. */
		public BGFXHmdEye.Buffer eye() { return BGFXHmd.neye(address()); }
		/** Returns a {@link BGFXHmdEye} view of the struct at the specified index of the {@code eye} field. */
		public BGFXHmdEye eye(int index) { return BGFXHmd.neye(address(), index); }
		/** Returns the value of the {@code width} field. */
		public short width() { return BGFXHmd.nwidth(address()); }
		/** Returns the value of the {@code height} field. */
		public short height() { return BGFXHmd.nheight(address()); }
		/** Returns the value of the {@code deviceWidth} field. */
		public int deviceWidth() { return BGFXHmd.ndeviceWidth(address()); }
		/** Returns the value of the {@code deviceHeight} field. */
		public int deviceHeight() { return BGFXHmd.ndeviceHeight(address()); }
		/** Returns the value of the {@code flags} field. */
		public byte flags() { return BGFXHmd.nflags(address()); }

	}

}