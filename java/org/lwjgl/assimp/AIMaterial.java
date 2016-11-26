/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Data structure for a material.
 * 
 * <p>Material data is stored using a key-value structure. A single key-value pair is called a 'material property'. C++ users should use the provided member
 * functions of {@code aiMaterial} to process material properties, C users have to stick with the {@code aiMaterialGetXXX} family of unbound functions.
 * The library defines a set of standard keys (AI_MATKEY_XXX).</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code mProperties} &ndash; List of all material properties loaded.</li>
 * <li>{@code mNumProperties} &ndash; Number of properties in the data base</li>
 * <li>{@code mStorageAllocated} &ndash; Storage allocated</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct aiMaterial {
    AIMaterialProperty ** mProperties;
    unsigned int mNumProperties;
    unsigned int mStorageAllocated;
}</code></pre>
 */
public class AIMaterial extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		MPROPERTIES,
		MNUMPROPERTIES,
		MSTORAGEALLOCATED;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		MPROPERTIES = layout.offsetof(0);
		MNUMPROPERTIES = layout.offsetof(1);
		MSTORAGEALLOCATED = layout.offsetof(2);
	}

	AIMaterial(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link AIMaterial} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public AIMaterial(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mProperties} field. */
	public PointerBuffer mProperties() { return nmProperties(address()); }
	/** Returns the value of the {@code mNumProperties} field. */
	public int mNumProperties() { return nmNumProperties(address()); }
	/** Returns the value of the {@code mStorageAllocated} field. */
	public int mStorageAllocated() { return nmStorageAllocated(address()); }

	/** Sets the address of the specified {@link PointerBuffer} to the {@code mProperties} field. */
	public AIMaterial mProperties(PointerBuffer value) { nmProperties(address(), value); return this; }
	/** Sets the specified value to the {@code mStorageAllocated} field. */
	public AIMaterial mStorageAllocated(int value) { nmStorageAllocated(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public AIMaterial set(
		PointerBuffer mProperties,
		int mStorageAllocated
	) {
		mProperties(mProperties);
		mStorageAllocated(mStorageAllocated);

		return this;
	}

	/** Unsafe version of {@link #set(AIMaterial) set}. */
	public AIMaterial nset(long struct) {
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
	public AIMaterial set(AIMaterial src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link AIMaterial} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static AIMaterial malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link AIMaterial} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static AIMaterial calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link AIMaterial} instance allocated with {@link BufferUtils}. */
	public static AIMaterial create() {
		return new AIMaterial(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link AIMaterial} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static AIMaterial create(long address) {
		return address == NULL ? null : new AIMaterial(address, null);
	}

	/**
	 * Returns a new {@link AIMaterial.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link AIMaterial.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link AIMaterial.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link AIMaterial.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link AIMaterial} instance allocated on the thread-local {@link MemoryStack}. */
	public static AIMaterial mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link AIMaterial} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static AIMaterial callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link AIMaterial} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static AIMaterial mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link AIMaterial} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static AIMaterial callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link AIMaterial.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link AIMaterial.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link AIMaterial.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link AIMaterial.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #mProperties() mProperties}. */
	public static PointerBuffer nmProperties(long struct) { return memPointerBuffer(memGetAddress(struct + AIMaterial.MPROPERTIES), nmNumProperties(struct)); }
	/** Unsafe version of {@link #mNumProperties}. */
	public static int nmNumProperties(long struct) { return memGetInt(struct + AIMaterial.MNUMPROPERTIES); }
	/** Unsafe version of {@link #mStorageAllocated}. */
	public static int nmStorageAllocated(long struct) { return memGetInt(struct + AIMaterial.MSTORAGEALLOCATED); }

	/** Unsafe version of {@link #mProperties(PointerBuffer) mProperties}. */
	public static void nmProperties(long struct, PointerBuffer value) { memPutAddress(struct + AIMaterial.MPROPERTIES, memAddress(value)); nmNumProperties(struct, value.remaining()); }
	/** Sets the specified value to the {@code mNumProperties} field of the specified {@code struct}. */
	public static void nmNumProperties(long struct, int value) { memPutInt(struct + AIMaterial.MNUMPROPERTIES, value); }
	/** Unsafe version of {@link #mStorageAllocated(int) mStorageAllocated}. */
	public static void nmStorageAllocated(long struct, int value) { memPutInt(struct + AIMaterial.MSTORAGEALLOCATED, value); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		check(memGetAddress(struct + AIMaterial.MPROPERTIES));
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

	/** An array of {@link AIMaterial} structs. */
	public static class Buffer extends StructBuffer<AIMaterial, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link AIMaterial.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link AIMaterial#SIZEOF}, and its mark will be undefined.
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
		protected AIMaterial newInstance(long address) {
			return new AIMaterial(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mProperties} field. */
		public PointerBuffer mProperties() { return AIMaterial.nmProperties(address()); }
		/** Returns the value of the {@code mNumProperties} field. */
		public int mNumProperties() { return AIMaterial.nmNumProperties(address()); }
		/** Returns the value of the {@code mStorageAllocated} field. */
		public int mStorageAllocated() { return AIMaterial.nmStorageAllocated(address()); }

		/** Sets the address of the specified {@link PointerBuffer} to the {@code mProperties} field. */
		public AIMaterial.Buffer mProperties(PointerBuffer value) { AIMaterial.nmProperties(address(), value); return this; }
		/** Sets the specified value to the {@code mStorageAllocated} field. */
		public AIMaterial.Buffer mStorageAllocated(int value) { AIMaterial.nmStorageAllocated(address(), value); return this; }

	}

}