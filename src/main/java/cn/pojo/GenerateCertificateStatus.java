package cn.pojo;

import javax.persistence.*;

@Table(name = "tbl_generate_certificate_status")
public class GenerateCertificateStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 证书模版id
     */
    @Column(name = "certificate_template_id")
    private Integer certificateTemplateId;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 证书的生成状态，0未完成，1已完成
     */
    @Column(name = "generate_status")
    private Byte generateStatus;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取证书模版id
     *
     * @return certificate_template_id - 证书模版id
     */
    public Integer getCertificateTemplateId() {
        return certificateTemplateId;
    }

    /**
     * 设置证书模版id
     *
     * @param certificateTemplateId 证书模版id
     */
    public void setCertificateTemplateId(Integer certificateTemplateId) {
        this.certificateTemplateId = certificateTemplateId;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取证书的生成状态，0未完成，1已完成
     *
     * @return generate_status - 证书的生成状态，0未完成，1已完成
     */
    public Byte getGenerateStatus() {
        return generateStatus;
    }

    /**
     * 设置证书的生成状态，0未完成，1已完成
     *
     * @param generateStatus 证书的生成状态，0未完成，1已完成
     */
    public void setGenerateStatus(Byte generateStatus) {
        this.generateStatus = generateStatus;
    }
}