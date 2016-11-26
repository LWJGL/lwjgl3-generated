/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Data structure for a single material property.
 * 
 * <p>As a user, you'll probably never need to deal with this data structure. Just use the provided {@code aiGetMaterialXXX()} family of functions to query
 * material properties easily. Processing them manually is faster, but it is not the recommended way. It isn't worth the effort.</p>
 * 
 * <p>Material property names follow a simple scheme:</p>
 * 
 * <pre><code>$<name>
?<name>
    A public property, there must be corresponding AI_MATKEY_XXX define
    2nd: Public, but ignored by the aiProcess_RemoveRedundantMaterials
    post-processing step.
~<name>
    A temporary property for internal use.</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code mKey} &ndash; Specifies the name of the property (key). Keys are generally case insensitive.</li>
 * <li>{@code mSemantic} &ndash; Textures: Specifies their exact usage semantic. For non-texture properties, this member is always 0 (or, better-said, {@link Assimp#aiTextureType_NONE TextureType_NONE}).</li>
 * <li>{@code mIndex} &ndash; Textures: Specifies the index of the texture. For non-texture properties, this member is always 0.</li>
 * <li>{@code mDataLength} &ndash; Size of the buffer {@code mData} is pointing to, in bytes. This value may not be 0.</li>
 * <li>{@code mType} &ndash; 
 * Type information for the property. Defines the data layout inside the data buffer. This is used by the library internally to perform debug checks and
 * to utilize proper type conversions. (It's probably a hacky solution, but it works.)</li>
 * <li>{@code mData} &ndash; Binary buffer to hold the property's value. The size of the buffer is always mDataLength.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct AIMaterialProperty {
    {@link AIString struct aiString} mKey;
    unsigned int mSemantic;
    unsigned int mIndex;
    unsigned int mDataLength;
    aiPropertyTypeInfo mType;
    char * mData;
}</code></pre>
 */
public class AIMaterialProperty extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		MKEY,
		MSEMANTIC,
		MINDEX,
		MDATALENGTH,
		MTYPE,
		MDATA;

	static {
		Layout layout = __struct(
			__member(AIString.SIZEOF, AIString.ALIGNOF),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		MKEY = layout.offsetof(0);
		MSEMANTIC = layout.offsetof(1);
		MINDEX = layout.offsetof(2);
		MDATALENGTH = layout.offsetof(3);
		MTYPE = layout.offsetof(4);
		MDATA = layout.offsetof(5);
	}

	AIMaterialProperty(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link AIMaterialProperty} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public AIMaterialProperty(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link AIString} view of the {@code mKey} field. */
	public AIString mKey() { return nmKey(address()); }
	/** Returns the value of the {@code mSemantic} field. */
	public int mSemantic() { return nmSemantic(address()); }
	/** Returns the value of the {@code mIndex} field. */
	public int mIndex() { return nmIndex(address()); }
	/** Returns the value of the {@code mDataLength} field. */
	public int mDataLength() { return nmDataLength(address()); }
	/** Returns the value of the {@code mType} field. */
	public int mType() { return nmType(address()); }
	/** Returns a {@link ByteBuffer} view of the data pointed to by the {@code mData} field. */
	public ByteBuffer mData() { return nmData(address()); }

	// -----------------------------------

	/** Returns a new {@link AIMaterialProperty} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static AIMaterialProperty create(long address) {
		return address == NULL ? null : new AIMaterialProperty(address, null);
	}

	/**
	 * Create a {@link AIMaterialProperty.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #mKey}. */
	public static AIString nmKey(long struct) { return AIString.create(struct + AIMaterialProperty.MKEY); }
	/** Unsafe version of {@link #mSemantic}. */
	public static int nmSemantic(long struct) { return memGetInt(struct + AIMaterialProperty.MSEMANTIC); }
	/** Unsafe version of {@link #mIndex}. */
	public static int nmIndex(long struct) { return memGetInt(struct + AIMaterialProperty.MINDEX); }
	/** Unsafe version of {@link #mDataLength}. */
	public static int nmDataLength(long struct) { return memGetInt(struct + AIMaterialProperty.MDATALENGTH); }
	/** Unsafe version of {@link #mType}. */
	public static int nmType(long struct) { return memGetInt(struct + AIMaterialProperty.MTYPE); }
	/** Unsafe version of {@link #mData() mData}. */
	public static ByteBuffer nmData(long struct) { return memByteBuffer(memGetAddress(struct + AIMaterialProperty.MDATA), nmDataLength(struct)); }

	// -----------------------------------

	/** An array of {@link AIMaterialProperty} structs. */
	public static class Buffer extends StructBuffer<AIMaterialProperty, Buffer> {

		/**
		 * Creates a new {@link AIMaterialProperty.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link AIMaterialProperty#SIZEOF}, and its mark will be undefined.
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
		protected AIMaterialProperty newInstance(long address) {
			return new AIMaterialProperty(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link AIString} view of the {@code mKey} field. */
		public AIString mKey() { return AIMaterialProperty.nmKey(address()); }
		/** Returns the value of the {@code mSemantic} field. */
		public int mSemantic() { return AIMaterialProperty.nmSemantic(address()); }
		/** Returns the value of the {@code mIndex} field. */
		public int mIndex() { return AIMaterialProperty.nmIndex(address()); }
		/** Returns the value of the {@code mDataLength} field. */
		public int mDataLength() { return AIMaterialProperty.nmDataLength(address()); }
		/** Returns the value of the {@code mType} field. */
		public int mType() { return AIMaterialProperty.nmType(address()); }
		/** Returns a {@link ByteBuffer} view of the data pointed to by the {@code mData} field. */
		public ByteBuffer mData() { return AIMaterialProperty.nmData(address()); }

	}

}