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
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code mNumProperties} &ndash; Length of the {@code mKeys} and {@code mValues} arrays, respectively</li>
 * <li>{@code mKeys} &ndash; Arrays of keys, may not be {@code NULL}. Entries in this array may not be {@code NULL} as well.</li>
 * <li>{@code mValues} &ndash; Arrays of values, may not be {@code NULL}. Entries in this array may be {@code NULL} if the corresponding property key has no assigned value.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct aiMetadata {
    unsigned int mNumProperties;
    {@link AIString struct aiString} * mKeys;
    {@link AIMetaDataEntry struct aiMetadataEntry} * mValues;
}</code></pre>
 */
public class AIMetaData extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		MNUMPROPERTIES,
		MKEYS,
		MVALUES;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		MNUMPROPERTIES = layout.offsetof(0);
		MKEYS = layout.offsetof(1);
		MVALUES = layout.offsetof(2);
	}

	AIMetaData(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link AIMetaData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public AIMetaData(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code mNumProperties} field. */
	public int mNumProperties() { return nmNumProperties(address()); }
	/** Returns a {@link AIString.Buffer} view of the struct array pointed to by the {@code mKeys} field. */
	public AIString.Buffer mKeys() { return nmKeys(address()); }
	/** Returns a {@link AIMetaDataEntry.Buffer} view of the struct array pointed to by the {@code mValues} field. */
	public AIMetaDataEntry.Buffer mValues() { return nmValues(address()); }

	/** Sets the specified value to the {@code mNumProperties} field. */
	public AIMetaData mNumProperties(int value) { nmNumProperties(address(), value); return this; }
	/** Sets the address of the specified {@link AIString.Buffer} to the {@code mKeys} field. */
	public AIMetaData mKeys(AIString.Buffer value) { nmKeys(address(), value); return this; }
	/** Sets the address of the specified {@link AIMetaDataEntry.Buffer} to the {@code mValues} field. */
	public AIMetaData mValues(AIMetaDataEntry.Buffer value) { nmValues(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public AIMetaData set(
		int mNumProperties,
		AIString.Buffer mKeys,
		AIMetaDataEntry.Buffer mValues
	) {
		mNumProperties(mNumProperties);
		mKeys(mKeys);
		mValues(mValues);

		return this;
	}

	/** Unsafe version of {@link #set(AIMetaData) set}. */
	public AIMetaData nset(long struct) {
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
	public AIMetaData set(AIMetaData src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link AIMetaData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static AIMetaData malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link AIMetaData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static AIMetaData calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link AIMetaData} instance allocated with {@link BufferUtils}. */
	public static AIMetaData create() {
		return new AIMetaData(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link AIMetaData} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static AIMetaData create(long address) {
		return address == NULL ? null : new AIMetaData(address, null);
	}

	/**
	 * Returns a new {@link AIMetaData.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link AIMetaData.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link AIMetaData.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link AIMetaData.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link AIMetaData} instance allocated on the thread-local {@link MemoryStack}. */
	public static AIMetaData mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link AIMetaData} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static AIMetaData callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link AIMetaData} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static AIMetaData mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link AIMetaData} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static AIMetaData callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link AIMetaData.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link AIMetaData.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link AIMetaData.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link AIMetaData.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #mNumProperties}. */
	public static int nmNumProperties(long struct) { return memGetInt(struct + AIMetaData.MNUMPROPERTIES); }
	/** Unsafe version of {@link #mKeys}. */
	public static AIString.Buffer nmKeys(long struct) { return AIString.create(memGetAddress(struct + AIMetaData.MKEYS), nmNumProperties(struct)); }
	/** Unsafe version of {@link #mValues}. */
	public static AIMetaDataEntry.Buffer nmValues(long struct) { return AIMetaDataEntry.create(memGetAddress(struct + AIMetaData.MVALUES), nmNumProperties(struct)); }

	/** Sets the specified value to the {@code mNumProperties} field of the specified {@code struct}. */
	public static void nmNumProperties(long struct, int value) { memPutInt(struct + AIMetaData.MNUMPROPERTIES, value); }
	/** Unsafe version of {@link #mKeys(AIString.Buffer) mKeys}. */
	public static void nmKeys(long struct, AIString.Buffer value) { memPutAddress(struct + AIMetaData.MKEYS, value.address()); }
	/** Unsafe version of {@link #mValues(AIMetaDataEntry.Buffer) mValues}. */
	public static void nmValues(long struct, AIMetaDataEntry.Buffer value) { memPutAddress(struct + AIMetaData.MVALUES, value.address()); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		int mNumProperties = nmNumProperties(struct);
		check(memGetAddress(struct + AIMetaData.MKEYS));
		long mValues = memGetAddress(struct + AIMetaData.MVALUES);
		check(mValues);
		AIMetaDataEntry.validate(mValues, mNumProperties);
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

	/** An array of {@link AIMetaData} structs. */
	public static class Buffer extends StructBuffer<AIMetaData, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link AIMetaData.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link AIMetaData#SIZEOF}, and its mark will be undefined.
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
		protected AIMetaData newInstance(long address) {
			return new AIMetaData(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code mNumProperties} field. */
		public int mNumProperties() { return AIMetaData.nmNumProperties(address()); }
		/** Returns a {@link AIString.Buffer} view of the struct array pointed to by the {@code mKeys} field. */
		public AIString.Buffer mKeys() { return AIMetaData.nmKeys(address()); }
		/** Returns a {@link AIMetaDataEntry.Buffer} view of the struct array pointed to by the {@code mValues} field. */
		public AIMetaDataEntry.Buffer mValues() { return AIMetaData.nmValues(address()); }

		/** Sets the specified value to the {@code mNumProperties} field. */
		public AIMetaData.Buffer mNumProperties(int value) { AIMetaData.nmNumProperties(address(), value); return this; }
		/** Sets the address of the specified {@link AIString.Buffer} to the {@code mKeys} field. */
		public AIMetaData.Buffer mKeys(AIString.Buffer value) { AIMetaData.nmKeys(address(), value); return this; }
		/** Sets the address of the specified {@link AIMetaDataEntry.Buffer} to the {@code mValues} field. */
		public AIMetaData.Buffer mValues(AIMetaDataEntry.Buffer value) { AIMetaData.nmValues(address(), value); return this; }

	}

}