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
 * <pre><code>struct EXRMultiPartImage {
    int num_images;
    {@link EXRImage EXRImage} * images;
}</code></pre>
 */
public class EXRMultiPartImage extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		NUM_IMAGES,
		IMAGES;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		NUM_IMAGES = layout.offsetof(0);
		IMAGES = layout.offsetof(1);
	}

	EXRMultiPartImage(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link EXRMultiPartImage} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public EXRMultiPartImage(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code num_images} field. */
	public int num_images() { return nnum_images(address()); }
	/** Returns a {@link EXRImage} view of the struct pointed to by the {@code images} field. */
	public EXRImage images() { return nimages(address()); }

	/** Sets the address of the specified {@link EXRImage} to the {@code images} field. */
	public EXRMultiPartImage images(EXRImage value) { nimages(address(), value); return this; }

	/** Unsafe version of {@link #set(EXRMultiPartImage) set}. */
	public EXRMultiPartImage nset(long struct) {
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
	public EXRMultiPartImage set(EXRMultiPartImage src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link EXRMultiPartImage} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static EXRMultiPartImage malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link EXRMultiPartImage} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static EXRMultiPartImage calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link EXRMultiPartImage} instance allocated with {@link BufferUtils}. */
	public static EXRMultiPartImage create() {
		return new EXRMultiPartImage(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link EXRMultiPartImage} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static EXRMultiPartImage create(long address) {
		return address == NULL ? null : new EXRMultiPartImage(address, null);
	}

	/**
	 * Returns a new {@link EXRMultiPartImage.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link EXRMultiPartImage.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link EXRMultiPartImage.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link EXRMultiPartImage.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link EXRMultiPartImage} instance allocated on the thread-local {@link MemoryStack}. */
	public static EXRMultiPartImage mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link EXRMultiPartImage} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static EXRMultiPartImage callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link EXRMultiPartImage} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static EXRMultiPartImage mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link EXRMultiPartImage} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static EXRMultiPartImage callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link EXRMultiPartImage.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link EXRMultiPartImage.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link EXRMultiPartImage.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link EXRMultiPartImage.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #num_images}. */
	public static int nnum_images(long struct) { return memGetInt(struct + EXRMultiPartImage.NUM_IMAGES); }
	/** Unsafe version of {@link #images}. */
	public static EXRImage nimages(long struct) { return EXRImage.create(memGetAddress(struct + EXRMultiPartImage.IMAGES)); }

	/** Sets the specified value to the {@code num_images} field of the specified {@code struct}. */
	public static void nnum_images(long struct, int value) { memPutInt(struct + EXRMultiPartImage.NUM_IMAGES, value); }
	/** Unsafe version of {@link #images(EXRImage) images}. */
	public static void nimages(long struct, EXRImage value) { memPutAddress(struct + EXRMultiPartImage.IMAGES, value.address()); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		int num_images = nnum_images(struct);
		long images = memGetAddress(struct + EXRMultiPartImage.IMAGES);
		check(images);
		EXRImage.validate(images, num_images);
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

	/** An array of {@link EXRMultiPartImage} structs. */
	public static class Buffer extends StructBuffer<EXRMultiPartImage, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link EXRMultiPartImage.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link EXRMultiPartImage#SIZEOF}, and its mark will be undefined.
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
		protected EXRMultiPartImage newInstance(long address) {
			return new EXRMultiPartImage(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code num_images} field. */
		public int num_images() { return EXRMultiPartImage.nnum_images(address()); }
		/** Returns a {@link EXRImage} view of the struct pointed to by the {@code images} field. */
		public EXRImage images() { return EXRMultiPartImage.nimages(address()); }

		/** Sets the address of the specified {@link EXRImage} to the {@code images} field. */
		public EXRMultiPartImage.Buffer images(EXRImage value) { EXRMultiPartImage.nimages(address(), value); return this; }

	}

}