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
 * Image data.
 * 
 * <h3>GLFWimage members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>width</td><td class="nw">int</td><td>the width, in pixels, of this image</td></tr>
 * <tr><td>height</td><td class="nw">int</td><td>the height, in pixels, of this image</td></tr>
 * <tr><td>pixels</td><td class="nw">unsigned char</td><td>the pixel data of this image, arranged left-to-right, top-to-bottom</td></tr>
 * </table>
 */
public class GLFWImage extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		WIDTH,
		HEIGHT,
		PIXELS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(Pointer.POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		WIDTH = layout.offsetof(0);
		HEIGHT = layout.offsetof(1);
		PIXELS = layout.offsetof(2);
	}

	GLFWImage(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link GLFWImage} instance at the specified memory address. */
	public GLFWImage(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link GLFWImage} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public GLFWImage(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code width} field. */
	public int width() { return nwidth(address()); }
	/** Returns the value of the {@code height} field. */
	public int height() { return nheight(address()); }
	/**
	 * Returns a {@link ByteBuffer} view of the data pointed to by the {@code pixels} field.
	 *
	 * @param capacity the number of elements in the returned {@link ByteBuffer}
	 */
	public ByteBuffer pixels(int capacity) { return npixels(address(), capacity); }

	/** Sets the specified value to the {@code width} field. */
	public GLFWImage width(int value) { nwidth(address(), value); return this; }
	/** Sets the specified value to the {@code height} field. */
	public GLFWImage height(int value) { nheight(address(), value); return this; }
	/** Sets the address of the specified {@link ByteBuffer} to the {@code pixels} field. */
	public GLFWImage pixels(ByteBuffer value) { npixels(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public GLFWImage set(
		int width,
		int height,
		ByteBuffer pixels
	) {
		width(width);
		height(height);
		pixels(pixels);

		return this;
	}

	/** Unsafe version of {@link #set(GLFWImage) set}. */
	public GLFWImage nset(long struct) {
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
	public GLFWImage set(GLFWImage src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(GLFWImage) set}. */
	public GLFWImage set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link GLFWImage} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static GLFWImage malloc() {
		return new GLFWImage(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link GLFWImage} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static GLFWImage calloc() {
		return new GLFWImage(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link GLFWImage} instance allocated with {@link BufferUtils}. */
	public static GLFWImage create() {
		return new GLFWImage(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link GLFWImage.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link GLFWImage.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link GLFWImage.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link GLFWImage.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #width}. */
	public static int nwidth(long struct) { return memGetInt(struct + GLFWImage.WIDTH); }
	/** Unsafe version of {@link #height}. */
	public static int nheight(long struct) { return memGetInt(struct + GLFWImage.HEIGHT); }
	/** Unsafe version of {@link #pixels(int) pixels}. */
	public static ByteBuffer npixels(long struct, int capacity) { return memByteBuffer(memGetAddress(struct + GLFWImage.PIXELS), capacity); }

	/** Unsafe version of {@link #width(int) width}. */
	public static void nwidth(long struct, int value) { memPutInt(struct + GLFWImage.WIDTH, value); }
	/** Unsafe version of {@link #height(int) height}. */
	public static void nheight(long struct, int value) { memPutInt(struct + GLFWImage.HEIGHT, value); }
	/** Unsafe version of {@link #pixels(ByteBuffer) pixels}. */
	public static void npixels(long struct, ByteBuffer value) { memPutAddress(struct + GLFWImage.PIXELS, memAddressSafe(value)); }

	// -----------------------------------

	/** An array of {@link GLFWImage} structs. */
	public static final class Buffer extends StructBuffer<GLFWImage, Buffer> {

		/**
		 * Creates a new {@link GLFWImage.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link GLFWImage#SIZEOF}, and its mark will be undefined.
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
		protected GLFWImage newInstance(long address) {
			return new GLFWImage(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code width} field. */
		public int width() { return nwidth(address()); }
		/** Returns the value of the {@code height} field. */
		public int height() { return nheight(address()); }
		/**
		 * Returns a {@link ByteBuffer} view of the data pointed to by the {@code pixels} field.
		 *
		 * @param capacity the number of elements in the returned {@link ByteBuffer}
		 */
		public ByteBuffer pixels(int capacity) { return npixels(address(), capacity); }

		/** Sets the specified value to the {@code width} field. */
		public GLFWImage.Buffer width(int value) { nwidth(address(), value); return this; }
		/** Sets the specified value to the {@code height} field. */
		public GLFWImage.Buffer height(int value) { nheight(address(), value); return this; }
		/** Sets the address of the specified {@link ByteBuffer} to the {@code pixels} field. */
		public GLFWImage.Buffer pixels(ByteBuffer value) { npixels(address(), value); return this; }

	}

}