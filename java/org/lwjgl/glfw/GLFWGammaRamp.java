/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.glfw;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Describes the gamma ramp for a monitor.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * struct GLFWgammaramp {
 *     unsigned short * red;
 *     unsigned short * green;
 *     unsigned short * blue;
 *     unsigned int size;
 * }</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><td>red</td><td>an array of value describing the response of the red channel</td></tr>
 * <tr><td>green</td><td>an array of value describing the response of the green channel</td></tr>
 * <tr><td>blue</td><td>an array of value describing the response of the blue channel</td></tr>
 * <tr><td>size</td><td>the number of elements in each array</td></tr>
 * </table>
 */
public class GLFWGammaRamp extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		RED,
		GREEN,
		BLUE,
		SIZE;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		RED = layout.offsetof(0);
		GREEN = layout.offsetof(1);
		BLUE = layout.offsetof(2);
		SIZE = layout.offsetof(3);
	}

	GLFWGammaRamp(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link GLFWGammaRamp} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public GLFWGammaRamp(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link ShortBuffer} view of the data pointed to by the {@code red} field. */
	public ShortBuffer red() { return nred(address()); }
	/** Returns a {@link ShortBuffer} view of the data pointed to by the {@code green} field. */
	public ShortBuffer green() { return ngreen(address()); }
	/** Returns a {@link ShortBuffer} view of the data pointed to by the {@code blue} field. */
	public ShortBuffer blue() { return nblue(address()); }
	/** Returns the value of the {@code size} field. */
	public int size() { return nsize(address()); }

	/** Sets the address of the specified {@link ShortBuffer} to the {@code red} field. */
	public GLFWGammaRamp red(ShortBuffer value) { nred(address(), value); return this; }
	/** Sets the address of the specified {@link ShortBuffer} to the {@code green} field. */
	public GLFWGammaRamp green(ShortBuffer value) { ngreen(address(), value); return this; }
	/** Sets the address of the specified {@link ShortBuffer} to the {@code blue} field. */
	public GLFWGammaRamp blue(ShortBuffer value) { nblue(address(), value); return this; }
	/** Sets the specified value to the {@code size} field. */
	public GLFWGammaRamp size(int value) { nsize(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public GLFWGammaRamp set(
		ShortBuffer red,
		ShortBuffer green,
		ShortBuffer blue
	) {
		red(red);
		green(green);
		blue(blue);
		size(red != null ? red.remaining() : (green != null ? green.remaining() : (blue != null ? blue.remaining() : 0)));

		return this;
	}

	/** Unsafe version of {@link #set(GLFWGammaRamp) set}. */
	public GLFWGammaRamp nset(long struct) {
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
	public GLFWGammaRamp set(GLFWGammaRamp src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link GLFWGammaRamp} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static GLFWGammaRamp malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link GLFWGammaRamp} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static GLFWGammaRamp calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link GLFWGammaRamp} instance allocated with {@link BufferUtils}. */
	public static GLFWGammaRamp create() {
		return new GLFWGammaRamp(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link GLFWGammaRamp} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static GLFWGammaRamp create(long address) {
		return address == NULL ? null : new GLFWGammaRamp(address, null);
	}

	/**
	 * Returns a new {@link GLFWGammaRamp.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link GLFWGammaRamp.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link GLFWGammaRamp.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link GLFWGammaRamp.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #red() red}. */
	public static ShortBuffer nred(long struct) { return memShortBuffer(memGetAddress(struct + GLFWGammaRamp.RED), nsize(struct)); }
	/** Unsafe version of {@link #green() green}. */
	public static ShortBuffer ngreen(long struct) { return memShortBuffer(memGetAddress(struct + GLFWGammaRamp.GREEN), nsize(struct)); }
	/** Unsafe version of {@link #blue() blue}. */
	public static ShortBuffer nblue(long struct) { return memShortBuffer(memGetAddress(struct + GLFWGammaRamp.BLUE), nsize(struct)); }
	/** Unsafe version of {@link #size}. */
	public static int nsize(long struct) { return memGetInt(struct + GLFWGammaRamp.SIZE); }

	/** Unsafe version of {@link #red(ShortBuffer) red}. */
	public static void nred(long struct, ShortBuffer value) { memPutAddress(struct + GLFWGammaRamp.RED, memAddressSafe(value)); }
	/** Unsafe version of {@link #green(ShortBuffer) green}. */
	public static void ngreen(long struct, ShortBuffer value) { memPutAddress(struct + GLFWGammaRamp.GREEN, memAddressSafe(value)); }
	/** Unsafe version of {@link #blue(ShortBuffer) blue}. */
	public static void nblue(long struct, ShortBuffer value) { memPutAddress(struct + GLFWGammaRamp.BLUE, memAddressSafe(value)); }
	/** Unsafe version of {@link #size(int) size}. */
	public static void nsize(long struct, int value) { memPutInt(struct + GLFWGammaRamp.SIZE, value); }

	// -----------------------------------

	/** An array of {@link GLFWGammaRamp} structs. */
	public static final class Buffer extends StructBuffer<GLFWGammaRamp, Buffer> {

		/**
		 * Creates a new {@link GLFWGammaRamp.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link GLFWGammaRamp#SIZEOF}, and its mark will be undefined.
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
		protected GLFWGammaRamp newInstance(long address) {
			return new GLFWGammaRamp(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link ShortBuffer} view of the data pointed to by the {@code red} field. */
		public ShortBuffer red() { return GLFWGammaRamp.nred(address()); }
		/** Returns a {@link ShortBuffer} view of the data pointed to by the {@code green} field. */
		public ShortBuffer green() { return GLFWGammaRamp.ngreen(address()); }
		/** Returns a {@link ShortBuffer} view of the data pointed to by the {@code blue} field. */
		public ShortBuffer blue() { return GLFWGammaRamp.nblue(address()); }
		/** Returns the value of the {@code size} field. */
		public int size() { return GLFWGammaRamp.nsize(address()); }

		/** Sets the address of the specified {@link ShortBuffer} to the {@code red} field. */
		public GLFWGammaRamp.Buffer red(ShortBuffer value) { GLFWGammaRamp.nred(address(), value); return this; }
		/** Sets the address of the specified {@link ShortBuffer} to the {@code green} field. */
		public GLFWGammaRamp.Buffer green(ShortBuffer value) { GLFWGammaRamp.ngreen(address(), value); return this; }
		/** Sets the address of the specified {@link ShortBuffer} to the {@code blue} field. */
		public GLFWGammaRamp.Buffer blue(ShortBuffer value) { GLFWGammaRamp.nblue(address(), value); return this; }
		/** Sets the specified value to the {@code size} field. */
		public GLFWGammaRamp.Buffer size(int value) { GLFWGammaRamp.nsize(address(), value); return this; }

	}

}