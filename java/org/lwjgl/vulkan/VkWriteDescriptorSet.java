/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkWriteDescriptorSet.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkWriteDescriptorSet">Vulkan Specification</a>
 * 
 * <p>Describes an operation updating the descriptor set using descriptors for resources specified in the structure.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code dstSet} <b>must</b> be a valid {@code VkDescriptorSet} handle</li>
 * <li>{@code descriptorType} <b>must</b> be a valid {@code VkDescriptorType} value</li>
 * <li>{@code descriptorCount} <b>must</b> be greater than 0</li>
 * <li>Each of {@code dstSet} and the elements of {@code pTexelBufferView} that are valid handles <b>must</b> have been created, allocated or retrieved from the
 * same {@code VkDevice}</li>
 * <li>{@code dstBinding} <b>must</b> be a valid binding point within {@code dstSet}</li>
 * <li>{@code descriptorType} <b>must</b> match the type of {@code dstBinding} within {@code dstSet}</li>
 * <li>The sum of {@code dstArrayElement} and {@code descriptorCount} <b>must</b> be less than or equal to the number of array elements in the descriptor set
 * binding specified by {@code dstBinding}, and all applicable consecutive bindings</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER}, {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE},
 * {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE} or {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT}, {@code pImageInfo} <b>must</b> be a pointer to an array of {@code descriptorCount}
 * valid {@link VkDescriptorImageInfo} structures</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER}, {@code pTexelBufferView} <b>must</b> be a
 * pointer to an array of {@code descriptorCount} valid {@code VkBufferView} handles</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER}, {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER}, {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC} or
 * {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC}, {@code pBufferInfo} <b>must</b> be a pointer to an array of {@code descriptorCount} valid
 * {@link VkDescriptorBufferInfo} structures</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER} or {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, and {@code dstSet} was not created with a layout
 * that included immutable samplers for {@code dstBinding} with {@code descriptorType}, the {@code sampler} member of any given element of
 * {@code pImageInfo} <b>must</b> be a valid {@code VkSampler} object</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}, {@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}, {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE} or
 * {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT}, the {@code imageView} and {@code imageLayout} members of any given element of {@code pImageInfo} <b>must</b> be a
 * valid {@code VkImageView} and {@code VkImageLayout}, respectively</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC}, the {@code offset} member of any given
 * element of {@code pBufferInfo} <b>must</b> be a multiple of {@link VkPhysicalDeviceLimits}{@code ::minUniformBufferOffsetAlignment}</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC}, the {@code offset} member of any given
 * element of {@code pBufferInfo} <b>must</b> be a multiple of {@link VkPhysicalDeviceLimits}{@code ::minStorageBufferOffsetAlignment}</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC}, the {@code buffer} member of any given
 * element of {@code pBufferInfo} <b>must</b> have been created with {@link VK10#VK_BUFFER_USAGE_UNIFORM_BUFFER_BIT BUFFER_USAGE_UNIFORM_BUFFER_BIT} set</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC}, the {@code buffer} member of any given
 * element of {@code pBufferInfo} <b>must</b> have been created with {@link VK10#VK_BUFFER_USAGE_STORAGE_BUFFER_BIT BUFFER_USAGE_STORAGE_BUFFER_BIT} set</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC}, the {@code range} member of any given
 * element of {@code pBufferInfo} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxUniformBufferRange}</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER} or {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC}, the {@code range} member of any given
 * element of {@code pBufferInfo} <b>must</b> be less than or equal to {@link VkPhysicalDeviceLimits}{@code ::maxStorageBufferRange}</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER}, the {@code VkBuffer} that any given element of {@code pTexelBufferView} was
 * created from <b>must</b> have been created with {@link VK10#VK_BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT BUFFER_USAGE_UNIFORM_TEXEL_BUFFER_BIT} set</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER}, the {@code VkBuffer} that any given element of {@code pTexelBufferView} was
 * created from <b>must</b> have been created with {@link VK10#VK_BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT BUFFER_USAGE_STORAGE_TEXEL_BUFFER_BIT} set</li>
 * <li>If {@code descriptorType} is {@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE} or {@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT}, the {@code imageView} member of any given element
 * of {@code pImageInfo} <b>must</b> have been created with the identity swizzle</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link VK10#VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code dstSet} &ndash; the destination descriptor set to update</li>
 * <li>{@code dstBinding} &ndash; the descriptor binding within that set</li>
 * <li>{@code dstArrayElement} &ndash; the starting element in that array</li>
 * <li>{@code descriptorCount} &ndash; the number of descriptors to update (the number of elements in {@code pImageInfO}, {@code pBufferInfO}, or {@code pTexelBufferVieW})</li>
 * <li>{@code descriptorType} &ndash; the type of each descriptor in {@code pImageInfo}, {@code pBufferInfo}, or {@code pTexelBufferView}, and must be the same type as what was specified in
 * {@link VkDescriptorSetLayoutBinding} for {@code dstSet} at {@code dstBinding}. The type of the descriptor also controls which array the descriptors are taken
 * from. One of:<br><table><tr><td>{@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}</td><td>{@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT}</td></tr><tr><td>{@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}</td><td>{@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER}</td></tr><tr><td>{@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER}</td><td>{@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC}</td></tr><tr><td>{@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}</td><td>{@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER}</td></tr><tr><td>{@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER}</td><td>{@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC}</td></tr><tr><td>{@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER}</td></tr></table></li>
 * <li>{@code pImageInfo} &ndash; points to an array of {@link VkDescriptorImageInfo} structures or is ignored</li>
 * <li>{@code pBufferInfo} &ndash; points to an array of {@link VkDescriptorBufferInfo} structures or is ignored</li>
 * <li>{@code pTexelBufferView} &ndash; points to an array of {@code VkBufferView} handles or is ignored</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkWriteDescriptorSet {
    VkStructureType sType;
    const void * pNext;
    VkDescriptorSet dstSet;
    uint32_t dstBinding;
    uint32_t dstArrayElement;
    uint32_t descriptorCount;
    VkDescriptorType descriptorType;
    const VkDescriptorImageInfo * pImageInfo;
    const VkDescriptorBufferInfo * pBufferInfo;
    const VkBufferView * pTexelBufferView;
}</code></pre>
 */
public class VkWriteDescriptorSet extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		DSTSET,
		DSTBINDING,
		DSTARRAYELEMENT,
		DESCRIPTORCOUNT,
		DESCRIPTORTYPE,
		PIMAGEINFO,
		PBUFFERINFO,
		PTEXELBUFFERVIEW;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(8),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		DSTSET = layout.offsetof(2);
		DSTBINDING = layout.offsetof(3);
		DSTARRAYELEMENT = layout.offsetof(4);
		DESCRIPTORCOUNT = layout.offsetof(5);
		DESCRIPTORTYPE = layout.offsetof(6);
		PIMAGEINFO = layout.offsetof(7);
		PBUFFERINFO = layout.offsetof(8);
		PTEXELBUFFERVIEW = layout.offsetof(9);
	}

	VkWriteDescriptorSet(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkWriteDescriptorSet} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkWriteDescriptorSet(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code dstSet} field. */
	public long dstSet() { return ndstSet(address()); }
	/** Returns the value of the {@code dstBinding} field. */
	public int dstBinding() { return ndstBinding(address()); }
	/** Returns the value of the {@code dstArrayElement} field. */
	public int dstArrayElement() { return ndstArrayElement(address()); }
	/** Returns the value of the {@code descriptorCount} field. */
	public int descriptorCount() { return ndescriptorCount(address()); }
	/** Returns the value of the {@code descriptorType} field. */
	public int descriptorType() { return ndescriptorType(address()); }
	/** Returns a {@link VkDescriptorImageInfo.Buffer} view of the struct array pointed to by the {@code pImageInfo} field. */
	public VkDescriptorImageInfo.Buffer pImageInfo() { return npImageInfo(address()); }
	/** Returns a {@link VkDescriptorBufferInfo.Buffer} view of the struct array pointed to by the {@code pBufferInfo} field. */
	public VkDescriptorBufferInfo.Buffer pBufferInfo() { return npBufferInfo(address()); }
	/** Returns a {@link LongBuffer} view of the data pointed to by the {@code pTexelBufferView} field. */
	public LongBuffer pTexelBufferView() { return npTexelBufferView(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkWriteDescriptorSet sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkWriteDescriptorSet pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code dstSet} field. */
	public VkWriteDescriptorSet dstSet(long value) { ndstSet(address(), value); return this; }
	/** Sets the specified value to the {@code dstBinding} field. */
	public VkWriteDescriptorSet dstBinding(int value) { ndstBinding(address(), value); return this; }
	/** Sets the specified value to the {@code dstArrayElement} field. */
	public VkWriteDescriptorSet dstArrayElement(int value) { ndstArrayElement(address(), value); return this; }
	/** Sets the specified value to the {@code descriptorType} field. */
	public VkWriteDescriptorSet descriptorType(int value) { ndescriptorType(address(), value); return this; }
	/** Sets the address of the specified {@link VkDescriptorImageInfo.Buffer} to the {@code pImageInfo} field. */
	public VkWriteDescriptorSet pImageInfo(VkDescriptorImageInfo.Buffer value) { npImageInfo(address(), value); return this; }
	/** Sets the address of the specified {@link VkDescriptorBufferInfo.Buffer} to the {@code pBufferInfo} field. */
	public VkWriteDescriptorSet pBufferInfo(VkDescriptorBufferInfo.Buffer value) { npBufferInfo(address(), value); return this; }
	/** Sets the address of the specified {@link LongBuffer} to the {@code pTexelBufferView} field. */
	public VkWriteDescriptorSet pTexelBufferView(LongBuffer value) { npTexelBufferView(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkWriteDescriptorSet set(
		int sType,
		long pNext,
		long dstSet,
		int dstBinding,
		int dstArrayElement,
		int descriptorType,
		VkDescriptorImageInfo.Buffer pImageInfo,
		VkDescriptorBufferInfo.Buffer pBufferInfo,
		LongBuffer pTexelBufferView
	) {
		sType(sType);
		pNext(pNext);
		dstSet(dstSet);
		dstBinding(dstBinding);
		dstArrayElement(dstArrayElement);
		descriptorType(descriptorType);
		pImageInfo(pImageInfo);
		pBufferInfo(pBufferInfo);
		pTexelBufferView(pTexelBufferView);

		return this;
	}

	/** Unsafe version of {@link #set(VkWriteDescriptorSet) set}. */
	public VkWriteDescriptorSet nset(long struct) {
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
	public VkWriteDescriptorSet set(VkWriteDescriptorSet src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkWriteDescriptorSet} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkWriteDescriptorSet malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkWriteDescriptorSet} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkWriteDescriptorSet calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkWriteDescriptorSet} instance allocated with {@link BufferUtils}. */
	public static VkWriteDescriptorSet create() {
		return new VkWriteDescriptorSet(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkWriteDescriptorSet} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkWriteDescriptorSet create(long address) {
		return address == NULL ? null : new VkWriteDescriptorSet(address, null);
	}

	/**
	 * Returns a new {@link VkWriteDescriptorSet.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkWriteDescriptorSet.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkWriteDescriptorSet.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkWriteDescriptorSet.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkWriteDescriptorSet} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkWriteDescriptorSet mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkWriteDescriptorSet} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkWriteDescriptorSet callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkWriteDescriptorSet} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkWriteDescriptorSet mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkWriteDescriptorSet} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkWriteDescriptorSet callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkWriteDescriptorSet.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkWriteDescriptorSet.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkWriteDescriptorSet.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkWriteDescriptorSet.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkWriteDescriptorSet.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkWriteDescriptorSet.PNEXT); }
	/** Unsafe version of {@link #dstSet}. */
	public static long ndstSet(long struct) { return memGetLong(struct + VkWriteDescriptorSet.DSTSET); }
	/** Unsafe version of {@link #dstBinding}. */
	public static int ndstBinding(long struct) { return memGetInt(struct + VkWriteDescriptorSet.DSTBINDING); }
	/** Unsafe version of {@link #dstArrayElement}. */
	public static int ndstArrayElement(long struct) { return memGetInt(struct + VkWriteDescriptorSet.DSTARRAYELEMENT); }
	/** Unsafe version of {@link #descriptorCount}. */
	public static int ndescriptorCount(long struct) { return memGetInt(struct + VkWriteDescriptorSet.DESCRIPTORCOUNT); }
	/** Unsafe version of {@link #descriptorType}. */
	public static int ndescriptorType(long struct) { return memGetInt(struct + VkWriteDescriptorSet.DESCRIPTORTYPE); }
	/** Unsafe version of {@link #pImageInfo}. */
	public static VkDescriptorImageInfo.Buffer npImageInfo(long struct) { return VkDescriptorImageInfo.create(memGetAddress(struct + VkWriteDescriptorSet.PIMAGEINFO), ndescriptorCount(struct)); }
	/** Unsafe version of {@link #pBufferInfo}. */
	public static VkDescriptorBufferInfo.Buffer npBufferInfo(long struct) { return VkDescriptorBufferInfo.create(memGetAddress(struct + VkWriteDescriptorSet.PBUFFERINFO), ndescriptorCount(struct)); }
	/** Unsafe version of {@link #pTexelBufferView() pTexelBufferView}. */
	public static LongBuffer npTexelBufferView(long struct) { return memLongBuffer(memGetAddress(struct + VkWriteDescriptorSet.PTEXELBUFFERVIEW), ndescriptorCount(struct)); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkWriteDescriptorSet.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkWriteDescriptorSet.PNEXT, value); }
	/** Unsafe version of {@link #dstSet(long) dstSet}. */
	public static void ndstSet(long struct, long value) { memPutLong(struct + VkWriteDescriptorSet.DSTSET, value); }
	/** Unsafe version of {@link #dstBinding(int) dstBinding}. */
	public static void ndstBinding(long struct, int value) { memPutInt(struct + VkWriteDescriptorSet.DSTBINDING, value); }
	/** Unsafe version of {@link #dstArrayElement(int) dstArrayElement}. */
	public static void ndstArrayElement(long struct, int value) { memPutInt(struct + VkWriteDescriptorSet.DSTARRAYELEMENT, value); }
	/** Sets the specified value to the {@code descriptorCount} field of the specified {@code struct}. */
	public static void ndescriptorCount(long struct, int value) { memPutInt(struct + VkWriteDescriptorSet.DESCRIPTORCOUNT, value); }
	/** Unsafe version of {@link #descriptorType(int) descriptorType}. */
	public static void ndescriptorType(long struct, int value) { memPutInt(struct + VkWriteDescriptorSet.DESCRIPTORTYPE, value); }
	/** Unsafe version of {@link #pImageInfo(VkDescriptorImageInfo.Buffer) pImageInfo}. */
	public static void npImageInfo(long struct, VkDescriptorImageInfo.Buffer value) { memPutAddress(struct + VkWriteDescriptorSet.PIMAGEINFO, addressSafe(value)); if ( value != null ) ndescriptorCount(struct, value.remaining()); }
	/** Unsafe version of {@link #pBufferInfo(VkDescriptorBufferInfo.Buffer) pBufferInfo}. */
	public static void npBufferInfo(long struct, VkDescriptorBufferInfo.Buffer value) { memPutAddress(struct + VkWriteDescriptorSet.PBUFFERINFO, addressSafe(value)); if ( value != null ) ndescriptorCount(struct, value.remaining()); }
	/** Unsafe version of {@link #pTexelBufferView(LongBuffer) pTexelBufferView}. */
	public static void npTexelBufferView(long struct, LongBuffer value) { memPutAddress(struct + VkWriteDescriptorSet.PTEXELBUFFERVIEW, memAddressSafe(value)); if ( value != null ) ndescriptorCount(struct, value.remaining()); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		int descriptorCount = ndescriptorCount(struct);
		if (
			descriptorCount == 0 || (
			memGetAddress(struct + VkWriteDescriptorSet.PIMAGEINFO) == NULL &&
			memGetAddress(struct + VkWriteDescriptorSet.PBUFFERINFO) == NULL &&
			memGetAddress(struct + VkWriteDescriptorSet.PTEXELBUFFERVIEW) == NULL
		)) {
			throw new NullPointerException("At least one of pImageInfo, pBufferInfo, pTexelBufferView must not be null");
		}
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

	/** An array of {@link VkWriteDescriptorSet} structs. */
	public static final class Buffer extends StructBuffer<VkWriteDescriptorSet, Buffer> {

		/**
		 * Creates a new {@link VkWriteDescriptorSet.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkWriteDescriptorSet#SIZEOF}, and its mark will be undefined.
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
		protected VkWriteDescriptorSet newInstance(long address) {
			return new VkWriteDescriptorSet(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkWriteDescriptorSet.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkWriteDescriptorSet.npNext(address()); }
		/** Returns the value of the {@code dstSet} field. */
		public long dstSet() { return VkWriteDescriptorSet.ndstSet(address()); }
		/** Returns the value of the {@code dstBinding} field. */
		public int dstBinding() { return VkWriteDescriptorSet.ndstBinding(address()); }
		/** Returns the value of the {@code dstArrayElement} field. */
		public int dstArrayElement() { return VkWriteDescriptorSet.ndstArrayElement(address()); }
		/** Returns the value of the {@code descriptorCount} field. */
		public int descriptorCount() { return VkWriteDescriptorSet.ndescriptorCount(address()); }
		/** Returns the value of the {@code descriptorType} field. */
		public int descriptorType() { return VkWriteDescriptorSet.ndescriptorType(address()); }
		/** Returns a {@link VkDescriptorImageInfo.Buffer} view of the struct array pointed to by the {@code pImageInfo} field. */
		public VkDescriptorImageInfo.Buffer pImageInfo() { return VkWriteDescriptorSet.npImageInfo(address()); }
		/** Returns a {@link VkDescriptorBufferInfo.Buffer} view of the struct array pointed to by the {@code pBufferInfo} field. */
		public VkDescriptorBufferInfo.Buffer pBufferInfo() { return VkWriteDescriptorSet.npBufferInfo(address()); }
		/** Returns a {@link LongBuffer} view of the data pointed to by the {@code pTexelBufferView} field. */
		public LongBuffer pTexelBufferView() { return VkWriteDescriptorSet.npTexelBufferView(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkWriteDescriptorSet.Buffer sType(int value) { VkWriteDescriptorSet.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkWriteDescriptorSet.Buffer pNext(long value) { VkWriteDescriptorSet.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code dstSet} field. */
		public VkWriteDescriptorSet.Buffer dstSet(long value) { VkWriteDescriptorSet.ndstSet(address(), value); return this; }
		/** Sets the specified value to the {@code dstBinding} field. */
		public VkWriteDescriptorSet.Buffer dstBinding(int value) { VkWriteDescriptorSet.ndstBinding(address(), value); return this; }
		/** Sets the specified value to the {@code dstArrayElement} field. */
		public VkWriteDescriptorSet.Buffer dstArrayElement(int value) { VkWriteDescriptorSet.ndstArrayElement(address(), value); return this; }
		/** Sets the specified value to the {@code descriptorType} field. */
		public VkWriteDescriptorSet.Buffer descriptorType(int value) { VkWriteDescriptorSet.ndescriptorType(address(), value); return this; }
		/** Sets the address of the specified {@link VkDescriptorImageInfo.Buffer} to the {@code pImageInfo} field. */
		public VkWriteDescriptorSet.Buffer pImageInfo(VkDescriptorImageInfo.Buffer value) { VkWriteDescriptorSet.npImageInfo(address(), value); return this; }
		/** Sets the address of the specified {@link VkDescriptorBufferInfo.Buffer} to the {@code pBufferInfo} field. */
		public VkWriteDescriptorSet.Buffer pBufferInfo(VkDescriptorBufferInfo.Buffer value) { VkWriteDescriptorSet.npBufferInfo(address(), value); return this; }
		/** Sets the address of the specified {@link LongBuffer} to the {@code pTexelBufferView} field. */
		public VkWriteDescriptorSet.Buffer pTexelBufferView(LongBuffer value) { VkWriteDescriptorSet.npTexelBufferView(address(), value); return this; }

	}

}