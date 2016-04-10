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
import static org.lwjgl.system.MemoryStack.*;

/**
 * Image data.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code width} &ndash; the width, in pixels, of this image</li>
 * <li>{@code height} &ndash; the height, in pixels, of this image</li>
 * <li>{@code pixels} &ndash; the pixel data of this image, arranged left-to-right, top-to-bottom</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct GLFWimage {
    int width;
    int height;
    unsigned char * pixels;
}</code></pre>
 */
public class GLFWImage extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		WIDTH,
		HEIGHT,
		PIXELS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		WIDTH = layout.offsetof(0);
		HEIGHT = layout.offsetof(1);
		PIXELS = layout.offsetof(2);
	}

	GLFWImage(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link GLFWImage} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public GLFWImage(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
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
	 * @param capacity the number of elements in the returned buffer
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

	// -----------------------------------

	/** Returns a new {@link GLFWImage} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static GLFWImage malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link GLFWImage} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static GLFWImage calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link GLFWImage} instance allocated with {@link BufferUtils}. */
	public static GLFWImage create() {
		return new GLFWImage(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link GLFWImage} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static GLFWImage create(long address) {
		return address == NULL ? null : new GLFWImage(address, null);
	}

	/**
	 * Returns a new {@link GLFWImage.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link GLFWImage.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link GLFWImage.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link GLFWImage.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link GLFWImage} instance allocated on the thread-local {@link MemoryStack}. */
	public static GLFWImage mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link GLFWImage} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static GLFWImage callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link GLFWImage} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static GLFWImage mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link GLFWImage} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static GLFWImage callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link GLFWImage.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link GLFWImage.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link GLFWImage.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link GLFWImage.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

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
	public static void npixels(long struct, ByteBuffer value) { memPutAddress(struct + GLFWImage.PIXELS, memAddress(value)); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + GLFWImage.PIXELS));
	}

	/**
	 * Calls {@link #validate(long)} for each struct contained in the specified struct array.
	 *
	 * @param array the struct array to validate
	 * @param count the number of structs in {@code array}
	 */
	public static void validate(long array, int count) {
		for ( int i = 0; i < count; i++ )
			validate(array + i * SIZEOF);
	}

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
		protected GLFWImage newInstance(long address) {
			return new GLFWImage(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code width} field. */
		public int width() { return GLFWImage.nwidth(address()); }
		/** Returns the value of the {@code height} field. */
		public int height() { return GLFWImage.nheight(address()); }
		/**
		 * Returns a {@link ByteBuffer} view of the data pointed to by the {@code pixels} field.
		 *
		 * @param capacity the number of elements in the returned buffer
		 */
		public ByteBuffer pixels(int capacity) { return GLFWImage.npixels(address(), capacity); }

		/** Sets the specified value to the {@code width} field. */
		public GLFWImage.Buffer width(int value) { GLFWImage.nwidth(address(), value); return this; }
		/** Sets the specified value to the {@code height} field. */
		public GLFWImage.Buffer height(int value) { GLFWImage.nheight(address(), value); return this; }
		/** Sets the address of the specified {@link ByteBuffer} to the {@code pixels} field. */
		public GLFWImage.Buffer pixels(ByteBuffer value) { GLFWImage.npixels(address(), value); return this; }

	}

}