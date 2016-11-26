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
 * A mesh represents a geometry or model with a single material.
 * 
 * <p>It usually consists of a number of vertices and a series of primitives/faces referencing the vertices. In addition there might be a series of bones,
 * each of them addressing a number of vertices with a certain weight. Vertex data is presented in channels with each channel containing a single
 * per-vertex information such as a set of texture coords or a normal vector. If a data pointer is non-null, the corresponding data stream is present.</p>
 * 
 * <p>A Mesh uses only a single material which is referenced by a material ID.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code mPrimitiveTypes} &ndash; Bitwise combination of the members of the {@code aiPrimitiveType} enum. This specifies which types of primitives are present in the mesh. The
 * "SortByPrimitiveType"-Step can be used to make sure the output meshes consist of one primitive type each. One or more of:<br><table><tr><td>{@link Assimp#aiPrimitiveType_LINE PrimitiveType_LINE}</td><td>{@link Assimp#aiPrimitiveType_POINT PrimitiveType_POINT}</td><td>{@link Assimp#aiPrimitiveType_POLYGON PrimitiveType_POLYGON}</td><td>{@link Assimp#aiPrimitiveType_TRIANGLE PrimitiveType_TRIANGLE}</td></tr></table></li>
 * <li>{@code mNumVertices} &ndash; 
 * The number of vertices in this mesh. This is also the size of all of the per-vertex data arrays. The maximum value for this member is
 * {@link Assimp#AI_MAX_VERTICES}.</li>
 * <li>{@code mNumFaces} &ndash; 
 * The number of primitives (triangles, polygons, lines) in this  mesh. This is also the size of the mFaces array. The maximum value for this member is
 * {@link Assimp#AI_MAX_FACES}.</li>
 * <li>{@code mVertices} &ndash; Vertex positions. This array is always present in a mesh. The array is {@code mNumVertices} in size.</li>
 * <li>{@code mNormals} &ndash; 
 * Vertex normals. The array contains normalized vectors, {@code NULL} if not present. The array is {@code mNumVertices} in size. Normals are undefined for point
 * and line primitives. A mesh consisting of points and lines only may not have normal vectors. Meshes with mixed primitive types (i.e. lines and
 * triangles) may have normals, but the normals for vertices that are only referenced by point or line primitives are undefined and set to {@code qNaN}.</li>
 * <li>{@code mTangents} &ndash; 
 * Vertex tangents. The tangent of a vertex points in the direction of the positive X texture axis. The array contains normalized vectors, {@code NULL} if not
 * present. The array is {@code mNumVertices} in size. A mesh consisting of points and lines only may not have normal vectors. Meshes with mixed primitive
 * types (i.e. lines and triangles) may have normals, but the normals for vertices that are only referenced by point or line primitives are undefined and
 * set to {@code qNaN}.</li>
 * <li>{@code mBitangents} &ndash; 
 * Vertex bitangents. The bitangent of a vertex points in the direction of the positive Y texture axis. The array contains normalized vectors, {@code NULL} if
 * not present. The array is {@code mNumVertices} in size.</li>
 * <li>{@code mColors} &ndash; 
 * Vertex color sets. A mesh may contain 0 to {@link Assimp#AI_MAX_NUMBER_OF_COLOR_SETS} vertex colors per vertex. {@code NULL} if not present. Each array is
 * {@code mNumVertices} in size if present.</li>
 * <li>{@code mTextureCoords} &ndash; 
 * Vertex texture coords, also known as UV channels. A mesh may contain 0 to {@link Assimp#AI_MAX_NUMBER_OF_TEXTURECOORDS} per vertex. {@code NULL} if not present. The
 * array is {@code mNumVertices} in size.</li>
 * <li>{@code mNumUVComponents} &ndash; 
 * Specifies the number of components for a given UV channel. Up to three channels are supported (UVW, for accessing volume or cube maps). If the value is
 * 2 for a given channel n, the component {@code p.z} of {@code mTextureCoords[n][p]} is set to 0.0f. If the value is 1 for a given channel, {@code p.y}
 * is set to 0.0f, too.</li>
 * <li>{@code mFaces} &ndash; 
 * The faces the mesh is constructed from. Each face refers to a number of vertices by their indices. This array is always present in a mesh, its size is
 * given in {@code mNumFaces}. If the {@link Assimp#AI_SCENE_FLAGS_NON_VERBOSE_FORMAT} is NOT set each face references an unique set of vertices.</li>
 * <li>{@code mNumBones} &ndash; The number of bones this mesh contains. Can be 0, in which case the {@code mBones} array is {@code NULL}.</li>
 * <li>{@code mBones} &ndash; The bones of this mesh. A bone consists of a name by which it can be found in the frame hierarchy and a set of vertex weights.</li>
 * <li>{@code mMaterialIndex} &ndash; 
 * The material used by this mesh. A mesh uses only a single material. If an imported model uses multiple materials, the import splits up the mesh. Use
 * this value as index into the scene's material list.</li>
 * <li>{@code mName} &ndash; 
 * Name of the mesh. Meshes can be named, but this is not a requirement and leaving this field empty is totally fine. There are mainly three uses for mesh
 * names: - some formats name nodes and meshes independently. - importers tend to split meshes up to meet the one-material-per-mesh requirement. Assigning
 * the same (dummy) name to each of the result meshes aids the caller at recovering the original mesh partitioning. - Vertex animations refer to meshes by
 * their names.</li>
 * <li>{@code mNumAnimMeshes} &ndash; NOT CURRENTLY IN USE. The number of attachment meshes</li>
 * <li>{@code mAnimMeshes} &ndash; 
 * NOT CURRENTLY IN USE. Attachment meshes for this mesh, for vertex-based animation. Attachment meshes carry replacement data for some of the mesh'es
 * vertex components (usually positions, normals).</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct aiMesh {
    unsigned int mPrimitiveTypes;
    unsigned int mNumVertices;
    unsigned int mNumFaces;
    struct aiVector3D * mVertices;
    struct aiVector3D * mNormals;
    struct aiVector3D * mTangents;
    struct aiVector3D * mBitangents;
    struct aiColor4D * mColors[Assimp.AI_MAX_NUMBER_OF_COLOR_SETS];
    struct aiVector3D * mTextureCoords[Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS];
    unsigned int mNumUVComponents[Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS];
    struct aiFace * mFaces;
    unsigned int mNumBones;
    struct aiBone ** mBones;
    unsigned int mMaterialIndex;
    {@link AIString struct aiString} mName;
    unsigned int mNumAnimMeshes;
    struct aiAnimMesh ** mAnimMeshes;
}</code></pre>
 */
public class AIMesh extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		MPRIMITIVETYPES,
		MNUMVERTICES,
		MNUMFACES,
		MVERTICES,
		MNORMALS,
		MTANGENTS,
		MBITANGENTS,
		MCOLORS,
		MTEXTURECOORDS,
		MNUMUVCOMPONENTS,
		MFACES,
		MNUMBONES,
		MBONES,
		MMATERIALINDEX,
		MNAME,
		MNUMANIMMESHES,
		MANIMMESHES;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__array(POINTER_SIZE, Assimp.AI_MAX_NUMBER_OF_COLOR_SETS),
			__array(POINTER_SIZE, Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS),
			__array(4, Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(AIString.SIZEOF, AIString.ALIGNOF),
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		MPRIMITIVETYPES = layout.offsetof(0);
		MNUMVERTICES = layout.offsetof(1);
		MNUMFACES = layout.offsetof(2);
		MVERTICES = layout.offsetof(3);
		MNORMALS = layout.offsetof(4);
		MTANGENTS = layout.offsetof(5);
		MBITANGENTS = layout.offsetof(6);
		MCOLORS = layout.offsetof(7);
		MTEXTURECOORDS = layout.offsetof(8);
		MNUMUVCOMPONENTS = layout.offsetof(9);
		MFACES = layout.offsetof(10);
		MNUMBONES = layout.offsetof(11);
		MBONES = layout.offsetof(12);
		MMATERIALINDEX = layout.offsetof(13);
		MNAME = layout.offsetof(14);
		MNUMANIMMESHES = layout.offsetof(15);
		MANIMMESHES = layout.offsetof(16);
	}

	AIMesh(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link AIMesh} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public AIMesh(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code mPrimitiveTypes} field. */
	public int mPrimitiveTypes() { return nmPrimitiveTypes(address()); }
	/** Returns the value of the {@code mNumVertices} field. */
	public int mNumVertices() { return nmNumVertices(address()); }
	/** Returns the value of the {@code mNumFaces} field. */
	public int mNumFaces() { return nmNumFaces(address()); }
	/** Returns a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mVertices} field. */
	public AIVector3D.Buffer mVertices() { return nmVertices(address()); }
	/** Returns a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mNormals} field. */
	public AIVector3D.Buffer mNormals() { return nmNormals(address()); }
	/** Returns a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mTangents} field. */
	public AIVector3D.Buffer mTangents() { return nmTangents(address()); }
	/** Returns a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mBitangents} field. */
	public AIVector3D.Buffer mBitangents() { return nmBitangents(address()); }
	/** Returns a {@link PointerBuffer} view of the {@code mColors} field. */
	public PointerBuffer mColors() { return nmColors(address()); }
	/** Returns a {@link AIColor4D} view of the pointer at the specified index of the {@code mColors}. */
	public AIColor4D mColors(int index) { return nmColors(address(), index); }
	/** Returns a {@link PointerBuffer} view of the {@code mTextureCoords} field. */
	public PointerBuffer mTextureCoords() { return nmTextureCoords(address()); }
	/** Returns a {@link AIVector3D} view of the pointer at the specified index of the {@code mTextureCoords}. */
	public AIVector3D mTextureCoords(int index) { return nmTextureCoords(address(), index); }
	/** Returns a {@link IntBuffer} view of the {@code mNumUVComponents} field. */
	public IntBuffer mNumUVComponents() { return nmNumUVComponents(address()); }
	/** Returns the value at the specified index of the {@code mNumUVComponents} field. */
	public int mNumUVComponents(int index) { return nmNumUVComponents(address(), index); }
	/** Returns a {@link AIFace.Buffer} view of the struct array pointed to by the {@code mFaces} field. */
	public AIFace.Buffer mFaces() { return nmFaces(address()); }
	/** Returns the value of the {@code mNumBones} field. */
	public int mNumBones() { return nmNumBones(address()); }
	/** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mBones} field. */
	public PointerBuffer mBones() { return nmBones(address()); }
	/** Returns the value of the {@code mMaterialIndex} field. */
	public int mMaterialIndex() { return nmMaterialIndex(address()); }
	/** Returns a {@link AIString} view of the {@code mName} field. */
	public AIString mName() { return nmName(address()); }
	/** Returns the value of the {@code mNumAnimMeshes} field. */
	public int mNumAnimMeshes() { return nmNumAnimMeshes(address()); }
	/** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mAnimMeshes} field. */
	public PointerBuffer mAnimMeshes() { return nmAnimMeshes(address()); }

	/** Sets the specified value to the {@code mPrimitiveTypes} field. */
	public AIMesh mPrimitiveTypes(int value) { nmPrimitiveTypes(address(), value); return this; }
	/** Sets the specified value to the {@code mNumVertices} field. */
	public AIMesh mNumVertices(int value) { nmNumVertices(address(), value); return this; }
	/** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mVertices} field. */
	public AIMesh mVertices(AIVector3D.Buffer value) { nmVertices(address(), value); return this; }
	/** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mNormals} field. */
	public AIMesh mNormals(AIVector3D.Buffer value) { nmNormals(address(), value); return this; }
	/** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mTangents} field. */
	public AIMesh mTangents(AIVector3D.Buffer value) { nmTangents(address(), value); return this; }
	/** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mBitangents} field. */
	public AIMesh mBitangents(AIVector3D.Buffer value) { nmBitangents(address(), value); return this; }
	/** Copies the specified {@link PointerBuffer} to the {@code mColors} field. */
	public AIMesh mColors(PointerBuffer value) { nmColors(address(), value); return this; }
	/** Copies the address of the specified {@link AIColor4D} at the specified index of the {@code mColors} field. */
	public AIMesh mColors(int index, AIColor4D value) { nmColors(address(), index, value); return this; }
	/** Copies the specified {@link PointerBuffer} to the {@code mTextureCoords} field. */
	public AIMesh mTextureCoords(PointerBuffer value) { nmTextureCoords(address(), value); return this; }
	/** Copies the address of the specified {@link AIVector3D} at the specified index of the {@code mTextureCoords} field. */
	public AIMesh mTextureCoords(int index, AIVector3D value) { nmTextureCoords(address(), index, value); return this; }
	/** Copies the specified {@link IntBuffer} to the {@code mNumUVComponents} field. */
	public AIMesh mNumUVComponents(IntBuffer value) { nmNumUVComponents(address(), value); return this; }
	/** Sets the specified value at the specified index of the {@code mNumUVComponents} field. */
	public AIMesh mNumUVComponents(int index, int value) { nmNumUVComponents(address(), index, value); return this; }
	/** Sets the address of the specified {@link AIFace.Buffer} to the {@code mFaces} field. */
	public AIMesh mFaces(AIFace.Buffer value) { nmFaces(address(), value); return this; }
	/** Sets the specified value to the {@code mNumBones} field. */
	public AIMesh mNumBones(int value) { nmNumBones(address(), value); return this; }
	/** Sets the address of the specified {@link PointerBuffer} to the {@code mBones} field. */
	public AIMesh mBones(PointerBuffer value) { nmBones(address(), value); return this; }
	/** Sets the specified value to the {@code mMaterialIndex} field. */
	public AIMesh mMaterialIndex(int value) { nmMaterialIndex(address(), value); return this; }
	/** Copies the specified {@link AIString} to the {@code mName} field. */
	public AIMesh mName(AIString value) { nmName(address(), value); return this; }
	/** Sets the specified value to the {@code mNumAnimMeshes} field. */
	public AIMesh mNumAnimMeshes(int value) { nmNumAnimMeshes(address(), value); return this; }
	/** Sets the address of the specified {@link PointerBuffer} to the {@code mAnimMeshes} field. */
	public AIMesh mAnimMeshes(PointerBuffer value) { nmAnimMeshes(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public AIMesh set(
		int mPrimitiveTypes,
		int mNumVertices,
		AIVector3D.Buffer mVertices,
		AIVector3D.Buffer mNormals,
		AIVector3D.Buffer mTangents,
		AIVector3D.Buffer mBitangents,
		PointerBuffer mColors,
		PointerBuffer mTextureCoords,
		IntBuffer mNumUVComponents,
		AIFace.Buffer mFaces,
		int mNumBones,
		PointerBuffer mBones,
		int mMaterialIndex,
		AIString mName,
		int mNumAnimMeshes,
		PointerBuffer mAnimMeshes
	) {
		mPrimitiveTypes(mPrimitiveTypes);
		mNumVertices(mNumVertices);
		mVertices(mVertices);
		mNormals(mNormals);
		mTangents(mTangents);
		mBitangents(mBitangents);
		mColors(mColors);
		mTextureCoords(mTextureCoords);
		mNumUVComponents(mNumUVComponents);
		mFaces(mFaces);
		mNumBones(mNumBones);
		mBones(mBones);
		mMaterialIndex(mMaterialIndex);
		mName(mName);
		mNumAnimMeshes(mNumAnimMeshes);
		mAnimMeshes(mAnimMeshes);

		return this;
	}

	/** Unsafe version of {@link #set(AIMesh) set}. */
	public AIMesh nset(long struct) {
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
	public AIMesh set(AIMesh src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link AIMesh} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static AIMesh malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link AIMesh} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static AIMesh calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link AIMesh} instance allocated with {@link BufferUtils}. */
	public static AIMesh create() {
		return new AIMesh(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link AIMesh} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static AIMesh create(long address) {
		return address == NULL ? null : new AIMesh(address, null);
	}

	/**
	 * Returns a new {@link AIMesh.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link AIMesh.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link AIMesh.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link AIMesh.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link AIMesh} instance allocated on the thread-local {@link MemoryStack}. */
	public static AIMesh mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link AIMesh} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static AIMesh callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link AIMesh} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static AIMesh mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link AIMesh} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static AIMesh callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link AIMesh.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link AIMesh.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link AIMesh.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link AIMesh.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #mPrimitiveTypes}. */
	public static int nmPrimitiveTypes(long struct) { return memGetInt(struct + AIMesh.MPRIMITIVETYPES); }
	/** Unsafe version of {@link #mNumVertices}. */
	public static int nmNumVertices(long struct) { return memGetInt(struct + AIMesh.MNUMVERTICES); }
	/** Unsafe version of {@link #mNumFaces}. */
	public static int nmNumFaces(long struct) { return memGetInt(struct + AIMesh.MNUMFACES); }
	/** Unsafe version of {@link #mVertices}. */
	public static AIVector3D.Buffer nmVertices(long struct) { return AIVector3D.create(memGetAddress(struct + AIMesh.MVERTICES), nmNumVertices(struct)); }
	/** Unsafe version of {@link #mNormals}. */
	public static AIVector3D.Buffer nmNormals(long struct) { return AIVector3D.create(memGetAddress(struct + AIMesh.MNORMALS), nmNumVertices(struct)); }
	/** Unsafe version of {@link #mTangents}. */
	public static AIVector3D.Buffer nmTangents(long struct) { return AIVector3D.create(memGetAddress(struct + AIMesh.MTANGENTS), nmNumVertices(struct)); }
	/** Unsafe version of {@link #mBitangents}. */
	public static AIVector3D.Buffer nmBitangents(long struct) { return AIVector3D.create(memGetAddress(struct + AIMesh.MBITANGENTS), nmNumVertices(struct)); }
	/** Unsafe version of {@link #mColors}. */
	public static PointerBuffer nmColors(long struct) {
		return memPointerBuffer(struct + AIMesh.MCOLORS, nmNumVertices(struct));
	}
	/** Unsafe version of {@link #mColors(int) mColors}. */
	public static AIColor4D nmColors(long struct, int index) {
		if ( CHECKS ) check(index, Assimp.AI_MAX_NUMBER_OF_COLOR_SETS);
		return AIColor4D.create(memGetAddress(struct + AIMesh.MCOLORS + index * POINTER_SIZE));
	}
	/** Unsafe version of {@link #mTextureCoords}. */
	public static PointerBuffer nmTextureCoords(long struct) {
		return memPointerBuffer(struct + AIMesh.MTEXTURECOORDS, nmNumVertices(struct));
	}
	/** Unsafe version of {@link #mTextureCoords(int) mTextureCoords}. */
	public static AIVector3D nmTextureCoords(long struct, int index) {
		if ( CHECKS ) check(index, Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS);
		return AIVector3D.create(memGetAddress(struct + AIMesh.MTEXTURECOORDS + index * POINTER_SIZE));
	}
	/** Unsafe version of {@link #mNumUVComponents}. */
	public static IntBuffer nmNumUVComponents(long struct) {
		return memIntBuffer(struct + AIMesh.MNUMUVCOMPONENTS, Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS);
	}
	/** Unsafe version of {@link #mNumUVComponents(int) mNumUVComponents}. */
	public static int nmNumUVComponents(long struct, int index) {
		if ( CHECKS ) check(index, Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS);
		return memGetInt(struct + AIMesh.MNUMUVCOMPONENTS + index * 4);
	}
	/** Unsafe version of {@link #mFaces}. */
	public static AIFace.Buffer nmFaces(long struct) { return AIFace.create(memGetAddress(struct + AIMesh.MFACES), nmNumFaces(struct)); }
	/** Unsafe version of {@link #mNumBones}. */
	public static int nmNumBones(long struct) { return memGetInt(struct + AIMesh.MNUMBONES); }
	/** Unsafe version of {@link #mBones() mBones}. */
	public static PointerBuffer nmBones(long struct) { return memPointerBuffer(memGetAddress(struct + AIMesh.MBONES), nmNumBones(struct)); }
	/** Unsafe version of {@link #mMaterialIndex}. */
	public static int nmMaterialIndex(long struct) { return memGetInt(struct + AIMesh.MMATERIALINDEX); }
	/** Unsafe version of {@link #mName}. */
	public static AIString nmName(long struct) { return AIString.create(struct + AIMesh.MNAME); }
	/** Unsafe version of {@link #mNumAnimMeshes}. */
	public static int nmNumAnimMeshes(long struct) { return memGetInt(struct + AIMesh.MNUMANIMMESHES); }
	/** Unsafe version of {@link #mAnimMeshes() mAnimMeshes}. */
	public static PointerBuffer nmAnimMeshes(long struct) { return memPointerBuffer(memGetAddress(struct + AIMesh.MANIMMESHES), nmNumAnimMeshes(struct)); }

	/** Unsafe version of {@link #mPrimitiveTypes(int) mPrimitiveTypes}. */
	public static void nmPrimitiveTypes(long struct, int value) { memPutInt(struct + AIMesh.MPRIMITIVETYPES, value); }
	/** Sets the specified value to the {@code mNumVertices} field of the specified {@code struct}. */
	public static void nmNumVertices(long struct, int value) { memPutInt(struct + AIMesh.MNUMVERTICES, value); }
	/** Sets the specified value to the {@code mNumFaces} field of the specified {@code struct}. */
	public static void nmNumFaces(long struct, int value) { memPutInt(struct + AIMesh.MNUMFACES, value); }
	/** Unsafe version of {@link #mVertices(AIVector3D.Buffer) mVertices}. */
	public static void nmVertices(long struct, AIVector3D.Buffer value) { memPutAddress(struct + AIMesh.MVERTICES, value.address()); }
	/** Unsafe version of {@link #mNormals(AIVector3D.Buffer) mNormals}. */
	public static void nmNormals(long struct, AIVector3D.Buffer value) { memPutAddress(struct + AIMesh.MNORMALS, addressSafe(value)); }
	/** Unsafe version of {@link #mTangents(AIVector3D.Buffer) mTangents}. */
	public static void nmTangents(long struct, AIVector3D.Buffer value) { memPutAddress(struct + AIMesh.MTANGENTS, addressSafe(value)); }
	/** Unsafe version of {@link #mBitangents(AIVector3D.Buffer) mBitangents}. */
	public static void nmBitangents(long struct, AIVector3D.Buffer value) { memPutAddress(struct + AIMesh.MBITANGENTS, addressSafe(value)); }
	/** Unsafe version of {@link #mColors(PointerBuffer) mColors}. */
	public static void nmColors(long struct, PointerBuffer value) {
		if ( CHECKS ) checkGT(value, Assimp.AI_MAX_NUMBER_OF_COLOR_SETS);
		memCopy(memAddress(value), struct + AIMesh.MCOLORS, value.remaining() * POINTER_SIZE);
	}
	/** Unsafe version of {@link #mColors(int, AIColor4D) mColors}. */
	public static void nmColors(long struct, int index, AIColor4D value) {
		if ( CHECKS ) check(index, Assimp.AI_MAX_NUMBER_OF_COLOR_SETS);
		memPutAddress(struct + AIMesh.MCOLORS + index * POINTER_SIZE, addressSafe(value));
	}
	/** Unsafe version of {@link #mTextureCoords(PointerBuffer) mTextureCoords}. */
	public static void nmTextureCoords(long struct, PointerBuffer value) {
		if ( CHECKS ) checkGT(value, Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS);
		memCopy(memAddress(value), struct + AIMesh.MTEXTURECOORDS, value.remaining() * POINTER_SIZE);
	}
	/** Unsafe version of {@link #mTextureCoords(int, AIVector3D) mTextureCoords}. */
	public static void nmTextureCoords(long struct, int index, AIVector3D value) {
		if ( CHECKS ) check(index, Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS);
		memPutAddress(struct + AIMesh.MTEXTURECOORDS + index * POINTER_SIZE, addressSafe(value));
	}
	/** Unsafe version of {@link #mNumUVComponents(IntBuffer) mNumUVComponents}. */
	public static void nmNumUVComponents(long struct, IntBuffer value) {
		if ( CHECKS ) checkGT(value, Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS);
		memCopy(memAddress(value), struct + AIMesh.MNUMUVCOMPONENTS, value.remaining() * 4);
	}
	/** Unsafe version of {@link #mNumUVComponents(int, int) mNumUVComponents}. */
	public static void nmNumUVComponents(long struct, int index, int value) {
		if ( CHECKS ) check(index, Assimp.AI_MAX_NUMBER_OF_TEXTURECOORDS);
		memPutInt(struct + AIMesh.MNUMUVCOMPONENTS + index * 4, value);
	}
	/** Unsafe version of {@link #mFaces(AIFace.Buffer) mFaces}. */
	public static void nmFaces(long struct, AIFace.Buffer value) { memPutAddress(struct + AIMesh.MFACES, value.address()); nmNumFaces(struct, value.remaining()); }
	/** Sets the specified value to the {@code mNumBones} field of the specified {@code struct}. */
	public static void nmNumBones(long struct, int value) { memPutInt(struct + AIMesh.MNUMBONES, value); }
	/** Unsafe version of {@link #mBones(PointerBuffer) mBones}. */
	public static void nmBones(long struct, PointerBuffer value) { memPutAddress(struct + AIMesh.MBONES, memAddressSafe(value)); if ( value != null ) nmNumBones(struct, value.remaining()); }
	/** Unsafe version of {@link #mMaterialIndex(int) mMaterialIndex}. */
	public static void nmMaterialIndex(long struct, int value) { memPutInt(struct + AIMesh.MMATERIALINDEX, value); }
	/** Unsafe version of {@link #mName(AIString) mName}. */
	public static void nmName(long struct, AIString value) { memCopy(value.address(), struct + AIMesh.MNAME, AIString.SIZEOF); }
	/** Sets the specified value to the {@code mNumAnimMeshes} field of the specified {@code struct}. */
	public static void nmNumAnimMeshes(long struct, int value) { memPutInt(struct + AIMesh.MNUMANIMMESHES, value); }
	/** Unsafe version of {@link #mAnimMeshes(PointerBuffer) mAnimMeshes}. */
	public static void nmAnimMeshes(long struct, PointerBuffer value) { memPutAddress(struct + AIMesh.MANIMMESHES, memAddressSafe(value)); if ( value != null ) nmNumAnimMeshes(struct, value.remaining()); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		int mNumFaces = nmNumFaces(struct);
		check(memGetAddress(struct + AIMesh.MVERTICES));
		long mFaces = memGetAddress(struct + AIMesh.MFACES);
		check(mFaces);
		AIFace.validate(mFaces, mNumFaces);
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

	/** An array of {@link AIMesh} structs. */
	public static class Buffer extends StructBuffer<AIMesh, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link AIMesh.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link AIMesh#SIZEOF}, and its mark will be undefined.
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
		protected AIMesh newInstance(long address) {
			return new AIMesh(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code mPrimitiveTypes} field. */
		public int mPrimitiveTypes() { return AIMesh.nmPrimitiveTypes(address()); }
		/** Returns the value of the {@code mNumVertices} field. */
		public int mNumVertices() { return AIMesh.nmNumVertices(address()); }
		/** Returns the value of the {@code mNumFaces} field. */
		public int mNumFaces() { return AIMesh.nmNumFaces(address()); }
		/** Returns a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mVertices} field. */
		public AIVector3D.Buffer mVertices() { return AIMesh.nmVertices(address()); }
		/** Returns a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mNormals} field. */
		public AIVector3D.Buffer mNormals() { return AIMesh.nmNormals(address()); }
		/** Returns a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mTangents} field. */
		public AIVector3D.Buffer mTangents() { return AIMesh.nmTangents(address()); }
		/** Returns a {@link AIVector3D.Buffer} view of the struct array pointed to by the {@code mBitangents} field. */
		public AIVector3D.Buffer mBitangents() { return AIMesh.nmBitangents(address()); }
		/** Returns a {@link PointerBuffer} view of the {@code mColors} field. */
		public PointerBuffer mColors() { return AIMesh.nmColors(address()); }
		/** Returns a {@link AIColor4D} view of the pointer at the specified index of the {@code mColors}. */
		public AIColor4D mColors(int index) { return AIMesh.nmColors(address(), index); }
		/** Returns a {@link PointerBuffer} view of the {@code mTextureCoords} field. */
		public PointerBuffer mTextureCoords() { return AIMesh.nmTextureCoords(address()); }
		/** Returns a {@link AIVector3D} view of the pointer at the specified index of the {@code mTextureCoords}. */
		public AIVector3D mTextureCoords(int index) { return AIMesh.nmTextureCoords(address(), index); }
		/** Returns a {@link IntBuffer} view of the {@code mNumUVComponents} field. */
		public IntBuffer mNumUVComponents() { return AIMesh.nmNumUVComponents(address()); }
		/** Returns the value at the specified index of the {@code mNumUVComponents} field. */
		public int mNumUVComponents(int index) { return AIMesh.nmNumUVComponents(address(), index); }
		/** Returns a {@link AIFace.Buffer} view of the struct array pointed to by the {@code mFaces} field. */
		public AIFace.Buffer mFaces() { return AIMesh.nmFaces(address()); }
		/** Returns the value of the {@code mNumBones} field. */
		public int mNumBones() { return AIMesh.nmNumBones(address()); }
		/** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mBones} field. */
		public PointerBuffer mBones() { return AIMesh.nmBones(address()); }
		/** Returns the value of the {@code mMaterialIndex} field. */
		public int mMaterialIndex() { return AIMesh.nmMaterialIndex(address()); }
		/** Returns a {@link AIString} view of the {@code mName} field. */
		public AIString mName() { return AIMesh.nmName(address()); }
		/** Returns the value of the {@code mNumAnimMeshes} field. */
		public int mNumAnimMeshes() { return AIMesh.nmNumAnimMeshes(address()); }
		/** Returns a {@link PointerBuffer} view of the data pointed to by the {@code mAnimMeshes} field. */
		public PointerBuffer mAnimMeshes() { return AIMesh.nmAnimMeshes(address()); }

		/** Sets the specified value to the {@code mPrimitiveTypes} field. */
		public AIMesh.Buffer mPrimitiveTypes(int value) { AIMesh.nmPrimitiveTypes(address(), value); return this; }
		/** Sets the specified value to the {@code mNumVertices} field. */
		public AIMesh.Buffer mNumVertices(int value) { AIMesh.nmNumVertices(address(), value); return this; }
		/** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mVertices} field. */
		public AIMesh.Buffer mVertices(AIVector3D.Buffer value) { AIMesh.nmVertices(address(), value); return this; }
		/** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mNormals} field. */
		public AIMesh.Buffer mNormals(AIVector3D.Buffer value) { AIMesh.nmNormals(address(), value); return this; }
		/** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mTangents} field. */
		public AIMesh.Buffer mTangents(AIVector3D.Buffer value) { AIMesh.nmTangents(address(), value); return this; }
		/** Sets the address of the specified {@link AIVector3D.Buffer} to the {@code mBitangents} field. */
		public AIMesh.Buffer mBitangents(AIVector3D.Buffer value) { AIMesh.nmBitangents(address(), value); return this; }
		/** Copies the specified {@link PointerBuffer} to the {@code mColors} field. */
		public AIMesh.Buffer mColors(PointerBuffer value) { AIMesh.nmColors(address(), value); return this; }
		/** Copies the address of the specified {@link AIColor4D} at the specified index of the {@code mColors} field. */
		public AIMesh.Buffer mColors(int index, AIColor4D value) { AIMesh.nmColors(address(), index, value); return this; }
		/** Copies the specified {@link PointerBuffer} to the {@code mTextureCoords} field. */
		public AIMesh.Buffer mTextureCoords(PointerBuffer value) { AIMesh.nmTextureCoords(address(), value); return this; }
		/** Copies the address of the specified {@link AIVector3D} at the specified index of the {@code mTextureCoords} field. */
		public AIMesh.Buffer mTextureCoords(int index, AIVector3D value) { AIMesh.nmTextureCoords(address(), index, value); return this; }
		/** Copies the specified {@link IntBuffer} to the {@code mNumUVComponents} field. */
		public AIMesh.Buffer mNumUVComponents(IntBuffer value) { AIMesh.nmNumUVComponents(address(), value); return this; }
		/** Sets the specified value at the specified index of the {@code mNumUVComponents} field. */
		public AIMesh.Buffer mNumUVComponents(int index, int value) { AIMesh.nmNumUVComponents(address(), index, value); return this; }
		/** Sets the address of the specified {@link AIFace.Buffer} to the {@code mFaces} field. */
		public AIMesh.Buffer mFaces(AIFace.Buffer value) { AIMesh.nmFaces(address(), value); return this; }
		/** Sets the specified value to the {@code mNumBones} field. */
		public AIMesh.Buffer mNumBones(int value) { AIMesh.nmNumBones(address(), value); return this; }
		/** Sets the address of the specified {@link PointerBuffer} to the {@code mBones} field. */
		public AIMesh.Buffer mBones(PointerBuffer value) { AIMesh.nmBones(address(), value); return this; }
		/** Sets the specified value to the {@code mMaterialIndex} field. */
		public AIMesh.Buffer mMaterialIndex(int value) { AIMesh.nmMaterialIndex(address(), value); return this; }
		/** Copies the specified {@link AIString} to the {@code mName} field. */
		public AIMesh.Buffer mName(AIString value) { AIMesh.nmName(address(), value); return this; }
		/** Sets the specified value to the {@code mNumAnimMeshes} field. */
		public AIMesh.Buffer mNumAnimMeshes(int value) { AIMesh.nmNumAnimMeshes(address(), value); return this; }
		/** Sets the address of the specified {@link PointerBuffer} to the {@code mAnimMeshes} field. */
		public AIMesh.Buffer mAnimMeshes(PointerBuffer value) { AIMesh.nmAnimMeshes(address(), value); return this; }

	}

}