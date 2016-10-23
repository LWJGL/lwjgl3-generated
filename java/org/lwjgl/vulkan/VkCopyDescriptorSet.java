/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying a copy descriptor set operation.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code srcBinding} <b>must</b> be a valid binding within {@code srcSet}</li>
 * <li>The sum of {@code srcArrayElement} and {@code descriptorCount} <b>must</b> be less than or equal to the number of array elements in the descriptor set binding specified by {@code srcBinding}, and all applicable consecutive bindings, as described by <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#descriptorsets-updates-consecutive">consecutive binding updates</a></li>
 * <li>{@code dstBinding} <b>must</b> be a valid binding within {@code dstSet}</li>
 * <li>The sum of {@code dstArrayElement} and {@code descriptorCount} <b>must</b> be less than or equal to the number of array elements in the descriptor set binding specified by {@code dstBinding}, and all applicable consecutive bindings, as described by <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#descriptorsets-updates-consecutive">consecutive binding updates</a></li>
 * <li>If {@code srcSet} is equal to {@code dstSet}, then the source and destination ranges of descriptors <b>must</b> not overlap, where the ranges <b>may</b> include array elements from consecutive bindings as described by <a href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#descriptorsets-updates-consecutive">consecutive binding updates</a></li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET STRUCTURE_TYPE_COPY_DESCRIPTOR_SET}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code srcSet} <b>must</b> be a valid {@code VkDescriptorSet} handle</li>
 * <li>{@code dstSet} <b>must</b> be a valid {@code VkDescriptorSet} handle</li>
 * <li>Both of {@code dstSet}, and {@code srcSet} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkUpdateDescriptorSets UpdateDescriptorSets}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code srcSet} &ndash; {@code srcSet}, {@code srcBinding}, and {@code srcArrayElement} are the source set, binding, and array element, respectively.</li>
 * <li>{@code srcBinding} &ndash; see {@code srcSet}</li>
 * <li>{@code srcArrayElement} &ndash; see {@code srcSet}</li>
 * <li>{@code dstSet} &ndash; {@code dstSet}, {@code dstBinding}, and {@code dstArrayElement} are the destination set, binding, and array element, respectively.</li>
 * <li>{@code dstBinding} &ndash; see {@code dstSet}</li>
 * <li>{@code dstArrayElement} &ndash; see {@code dstSet}</li>
 * <li>{@code descriptorCount} &ndash; the number of descriptors to copy from the source to destination. If {@code descriptorCount} is greater than the number of remaining array elements in the source or destination binding, those affect consecutive bindings in a manner similar to {@link VkWriteDescriptorSet} above.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkCopyDescriptorSet {
    VkStructureType sType;
    const void * pNext;
    VkDescriptorSet srcSet;
    uint32_t srcBinding;
    uint32_t srcArrayElement;
    VkDescriptorSet dstSet;
    uint32_t dstBinding;
    uint32_t dstArrayElement;
    uint32_t descriptorCount;
}</code></pre>
 */
public class VkCopyDescriptorSet extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		SRCSET,
		SRCBINDING,
		SRCARRAYELEMENT,
		DSTSET,
		DSTBINDING,
		DSTARRAYELEMENT,
		DESCRIPTORCOUNT;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(8),
			__member(4),
			__member(4),
			__member(8),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		SRCSET = layout.offsetof(2);
		SRCBINDING = layout.offsetof(3);
		SRCARRAYELEMENT = layout.offsetof(4);
		DSTSET = layout.offsetof(5);
		DSTBINDING = layout.offsetof(6);
		DSTARRAYELEMENT = layout.offsetof(7);
		DESCRIPTORCOUNT = layout.offsetof(8);
	}

	VkCopyDescriptorSet(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkCopyDescriptorSet} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkCopyDescriptorSet(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code srcSet} field. */
	public long srcSet() { return nsrcSet(address()); }
	/** Returns the value of the {@code srcBinding} field. */
	public int srcBinding() { return nsrcBinding(address()); }
	/** Returns the value of the {@code srcArrayElement} field. */
	public int srcArrayElement() { return nsrcArrayElement(address()); }
	/** Returns the value of the {@code dstSet} field. */
	public long dstSet() { return ndstSet(address()); }
	/** Returns the value of the {@code dstBinding} field. */
	public int dstBinding() { return ndstBinding(address()); }
	/** Returns the value of the {@code dstArrayElement} field. */
	public int dstArrayElement() { return ndstArrayElement(address()); }
	/** Returns the value of the {@code descriptorCount} field. */
	public int descriptorCount() { return ndescriptorCount(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkCopyDescriptorSet sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkCopyDescriptorSet pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code srcSet} field. */
	public VkCopyDescriptorSet srcSet(long value) { nsrcSet(address(), value); return this; }
	/** Sets the specified value to the {@code srcBinding} field. */
	public VkCopyDescriptorSet srcBinding(int value) { nsrcBinding(address(), value); return this; }
	/** Sets the specified value to the {@code srcArrayElement} field. */
	public VkCopyDescriptorSet srcArrayElement(int value) { nsrcArrayElement(address(), value); return this; }
	/** Sets the specified value to the {@code dstSet} field. */
	public VkCopyDescriptorSet dstSet(long value) { ndstSet(address(), value); return this; }
	/** Sets the specified value to the {@code dstBinding} field. */
	public VkCopyDescriptorSet dstBinding(int value) { ndstBinding(address(), value); return this; }
	/** Sets the specified value to the {@code dstArrayElement} field. */
	public VkCopyDescriptorSet dstArrayElement(int value) { ndstArrayElement(address(), value); return this; }
	/** Sets the specified value to the {@code descriptorCount} field. */
	public VkCopyDescriptorSet descriptorCount(int value) { ndescriptorCount(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkCopyDescriptorSet set(
		int sType,
		long pNext,
		long srcSet,
		int srcBinding,
		int srcArrayElement,
		long dstSet,
		int dstBinding,
		int dstArrayElement,
		int descriptorCount
	) {
		sType(sType);
		pNext(pNext);
		srcSet(srcSet);
		srcBinding(srcBinding);
		srcArrayElement(srcArrayElement);
		dstSet(dstSet);
		dstBinding(dstBinding);
		dstArrayElement(dstArrayElement);
		descriptorCount(descriptorCount);

		return this;
	}

	/** Unsafe version of {@link #set(VkCopyDescriptorSet) set}. */
	public VkCopyDescriptorSet nset(long struct) {
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
	public VkCopyDescriptorSet set(VkCopyDescriptorSet src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkCopyDescriptorSet} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkCopyDescriptorSet malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkCopyDescriptorSet} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkCopyDescriptorSet calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkCopyDescriptorSet} instance allocated with {@link BufferUtils}. */
	public static VkCopyDescriptorSet create() {
		return new VkCopyDescriptorSet(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkCopyDescriptorSet} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkCopyDescriptorSet create(long address) {
		return address == NULL ? null : new VkCopyDescriptorSet(address, null);
	}

	/**
	 * Returns a new {@link VkCopyDescriptorSet.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkCopyDescriptorSet.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkCopyDescriptorSet.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkCopyDescriptorSet.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkCopyDescriptorSet} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkCopyDescriptorSet mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkCopyDescriptorSet} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkCopyDescriptorSet callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkCopyDescriptorSet} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkCopyDescriptorSet mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkCopyDescriptorSet} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkCopyDescriptorSet callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkCopyDescriptorSet.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkCopyDescriptorSet.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkCopyDescriptorSet.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkCopyDescriptorSet.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkCopyDescriptorSet.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkCopyDescriptorSet.PNEXT); }
	/** Unsafe version of {@link #srcSet}. */
	public static long nsrcSet(long struct) { return memGetLong(struct + VkCopyDescriptorSet.SRCSET); }
	/** Unsafe version of {@link #srcBinding}. */
	public static int nsrcBinding(long struct) { return memGetInt(struct + VkCopyDescriptorSet.SRCBINDING); }
	/** Unsafe version of {@link #srcArrayElement}. */
	public static int nsrcArrayElement(long struct) { return memGetInt(struct + VkCopyDescriptorSet.SRCARRAYELEMENT); }
	/** Unsafe version of {@link #dstSet}. */
	public static long ndstSet(long struct) { return memGetLong(struct + VkCopyDescriptorSet.DSTSET); }
	/** Unsafe version of {@link #dstBinding}. */
	public static int ndstBinding(long struct) { return memGetInt(struct + VkCopyDescriptorSet.DSTBINDING); }
	/** Unsafe version of {@link #dstArrayElement}. */
	public static int ndstArrayElement(long struct) { return memGetInt(struct + VkCopyDescriptorSet.DSTARRAYELEMENT); }
	/** Unsafe version of {@link #descriptorCount}. */
	public static int ndescriptorCount(long struct) { return memGetInt(struct + VkCopyDescriptorSet.DESCRIPTORCOUNT); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkCopyDescriptorSet.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkCopyDescriptorSet.PNEXT, value); }
	/** Unsafe version of {@link #srcSet(long) srcSet}. */
	public static void nsrcSet(long struct, long value) { memPutLong(struct + VkCopyDescriptorSet.SRCSET, value); }
	/** Unsafe version of {@link #srcBinding(int) srcBinding}. */
	public static void nsrcBinding(long struct, int value) { memPutInt(struct + VkCopyDescriptorSet.SRCBINDING, value); }
	/** Unsafe version of {@link #srcArrayElement(int) srcArrayElement}. */
	public static void nsrcArrayElement(long struct, int value) { memPutInt(struct + VkCopyDescriptorSet.SRCARRAYELEMENT, value); }
	/** Unsafe version of {@link #dstSet(long) dstSet}. */
	public static void ndstSet(long struct, long value) { memPutLong(struct + VkCopyDescriptorSet.DSTSET, value); }
	/** Unsafe version of {@link #dstBinding(int) dstBinding}. */
	public static void ndstBinding(long struct, int value) { memPutInt(struct + VkCopyDescriptorSet.DSTBINDING, value); }
	/** Unsafe version of {@link #dstArrayElement(int) dstArrayElement}. */
	public static void ndstArrayElement(long struct, int value) { memPutInt(struct + VkCopyDescriptorSet.DSTARRAYELEMENT, value); }
	/** Unsafe version of {@link #descriptorCount(int) descriptorCount}. */
	public static void ndescriptorCount(long struct, int value) { memPutInt(struct + VkCopyDescriptorSet.DESCRIPTORCOUNT, value); }

	// -----------------------------------

	/** An array of {@link VkCopyDescriptorSet} structs. */
	public static class Buffer extends StructBuffer<VkCopyDescriptorSet, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkCopyDescriptorSet.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkCopyDescriptorSet#SIZEOF}, and its mark will be undefined.
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
		protected VkCopyDescriptorSet newInstance(long address) {
			return new VkCopyDescriptorSet(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkCopyDescriptorSet.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkCopyDescriptorSet.npNext(address()); }
		/** Returns the value of the {@code srcSet} field. */
		public long srcSet() { return VkCopyDescriptorSet.nsrcSet(address()); }
		/** Returns the value of the {@code srcBinding} field. */
		public int srcBinding() { return VkCopyDescriptorSet.nsrcBinding(address()); }
		/** Returns the value of the {@code srcArrayElement} field. */
		public int srcArrayElement() { return VkCopyDescriptorSet.nsrcArrayElement(address()); }
		/** Returns the value of the {@code dstSet} field. */
		public long dstSet() { return VkCopyDescriptorSet.ndstSet(address()); }
		/** Returns the value of the {@code dstBinding} field. */
		public int dstBinding() { return VkCopyDescriptorSet.ndstBinding(address()); }
		/** Returns the value of the {@code dstArrayElement} field. */
		public int dstArrayElement() { return VkCopyDescriptorSet.ndstArrayElement(address()); }
		/** Returns the value of the {@code descriptorCount} field. */
		public int descriptorCount() { return VkCopyDescriptorSet.ndescriptorCount(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkCopyDescriptorSet.Buffer sType(int value) { VkCopyDescriptorSet.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkCopyDescriptorSet.Buffer pNext(long value) { VkCopyDescriptorSet.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code srcSet} field. */
		public VkCopyDescriptorSet.Buffer srcSet(long value) { VkCopyDescriptorSet.nsrcSet(address(), value); return this; }
		/** Sets the specified value to the {@code srcBinding} field. */
		public VkCopyDescriptorSet.Buffer srcBinding(int value) { VkCopyDescriptorSet.nsrcBinding(address(), value); return this; }
		/** Sets the specified value to the {@code srcArrayElement} field. */
		public VkCopyDescriptorSet.Buffer srcArrayElement(int value) { VkCopyDescriptorSet.nsrcArrayElement(address(), value); return this; }
		/** Sets the specified value to the {@code dstSet} field. */
		public VkCopyDescriptorSet.Buffer dstSet(long value) { VkCopyDescriptorSet.ndstSet(address(), value); return this; }
		/** Sets the specified value to the {@code dstBinding} field. */
		public VkCopyDescriptorSet.Buffer dstBinding(int value) { VkCopyDescriptorSet.ndstBinding(address(), value); return this; }
		/** Sets the specified value to the {@code dstArrayElement} field. */
		public VkCopyDescriptorSet.Buffer dstArrayElement(int value) { VkCopyDescriptorSet.ndstArrayElement(address(), value); return this; }
		/** Sets the specified value to the {@code descriptorCount} field. */
		public VkCopyDescriptorSet.Buffer descriptorCount(int value) { VkCopyDescriptorSet.ndescriptorCount(address(), value); return this; }

	}

}